import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { AccountListComponent } from './account-list/account-list.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UpdateAccountComponent } from './update-account/update-account.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateAccountComponent,
    AccountDetailsComponent,
    AccountListComponent,
    UpdateAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
