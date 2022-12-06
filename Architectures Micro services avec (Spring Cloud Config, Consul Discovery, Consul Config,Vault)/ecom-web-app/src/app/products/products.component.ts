import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : any;
  title='pagination';
  PRODUCTS:any;
  page:number=1;
  count:number=0;
  dtOptions: DataTables.Settings = {};
  tableSize :number=5;
  tableSizes:any=[5,10,15,100]
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.fetchProducts();
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 5,
      processing: true
    };
  }

  fetchProducts(): void {

    this.http.get("http://localhost:9999/inventory-service/products?projection=fullProduct")
      .subscribe({
        next : (data)=>{
          this.products=data;
        },
        error : (err)=>{}
      });
  }
  onTableDataChange(event: any) {
    this.page = event;
    this.fetchProducts();
  }
  onTableSizeChange(event: any): void {
    this.tableSize = event.target.value;
    this.page = 1;
    this.fetchProducts();
  }

}
