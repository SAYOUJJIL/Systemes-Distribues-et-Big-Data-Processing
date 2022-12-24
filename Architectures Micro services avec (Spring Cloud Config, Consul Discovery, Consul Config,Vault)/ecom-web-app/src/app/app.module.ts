import {APP_INITIALIZER, NgModule} from '@angular/core';
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
import {KeycloakAngularModule, KeycloakService} from "keycloak-angular";

export function kcFactory(kcSecService : KeycloakService){
  return ()=>{
    console.log("Keycloak Initialization ...")
    kcSecService.init({
      config : {
        url : "http://localhost:8080",
        realm : "wallet-realm",
        clientId : "wallet-client"
      },
      loadUserProfileAtStartUp : true,
      initOptions : {
        onLoad : 'check-sso',
//silentCheckSsoRedirectUri: window.location.origin + '/assets/silent-check-sso.html',
//enableLogging:true,
        checkLoginIframe : true
      }
    });
  }
}

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
    NgxPaginationModule,
    KeycloakAngularModule,
  ],
  providers: [
    {provide : APP_INITIALIZER, deps : [KeycloakService], useFactory : kcFactory, multi : true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
