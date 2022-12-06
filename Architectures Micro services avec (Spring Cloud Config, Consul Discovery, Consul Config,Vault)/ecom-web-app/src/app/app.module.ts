import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import {HttpClientModule} from "@angular/common/http";
import { CustomersComponent } from './customers/customers.component';
import { OrdersComponent } from './orders/orders.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import {RouterModule} from "@angular/router";
import { HomeComponent } from './home/home.component';
import {DataTablesModule} from 'angular-datatables';
import {NgxPaginationModule} from "ngx-pagination";



@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    CustomersComponent,
    OrdersComponent,
    OrderDetailsComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    DataTablesModule,
    NgxPaginationModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
