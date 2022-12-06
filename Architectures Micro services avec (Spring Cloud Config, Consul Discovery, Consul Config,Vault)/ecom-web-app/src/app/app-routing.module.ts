import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsComponent} from "./products/products.component";
import {CustomersComponent} from "./customers/customers.component";
import {OrdersComponent} from "./orders/orders.component";
import {OrderDetailsComponent} from "./order-details/order-details.component";
import {HomeComponent} from "./home/home.component";

const routes: Routes = [
  {
    path:'',redirectTo:'home', pathMatch: 'full'
  },

  {
    path : "products", component : ProductsComponent
  },
  {
    path : "customers", component : CustomersComponent
  },
  {
    path : "orders/:customerId", component : OrdersComponent
  },
  {
    path : "order-details/:orderId", component : OrderDetailsComponent
  },
  {
    path : "home", component : HomeComponent
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
