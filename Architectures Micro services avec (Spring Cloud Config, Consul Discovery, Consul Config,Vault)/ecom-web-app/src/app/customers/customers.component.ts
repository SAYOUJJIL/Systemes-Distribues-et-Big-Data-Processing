import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
  customers :any;
  page:number=1;
  count:number=0;
  dtOptions: DataTables.Settings = {};
  tableSize :number=5;
  tableSizes:any=[5,10,15,100]
  constructor(private http:HttpClient, private router: Router) { }

  ngOnInit(): void {
    this.fetchCustomers();
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 5,
      processing: true
    };
  }

  fetchCustomers(): void {
    this.http.get("http://localhost:9999/customer-service/customers?projection=fullCustomer")
      .subscribe({
        next : (data)=>{
          this.customers=data;
        },
        error : (err)=>{}
      });
  }
  onTableDataChange(event: any) {
    this.page = event;
    this.fetchCustomers();
  }
  onTableSizeChange(event: any): void {
    this.tableSize = event.target.value;
    this.page = 1;
    this.fetchCustomers();
  }
  getOrders(c: any) {
    this.router.navigateByUrl("/orders/"+c.id);
  }
}
