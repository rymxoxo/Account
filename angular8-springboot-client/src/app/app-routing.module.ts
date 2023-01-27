import { AccountDetailsComponent } from './account-details/account-details.component';
import { UpdateAccountComponent } from './update-account/update-account.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { AccountListComponent } from './account-list/account-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'account', pathMatch: 'full' },
  { path: 'accounts', component: AccountListComponent },
  { path: 'add', component: CreateAccountComponent },
  { path: 'update/:id', component: UpdateAccountComponent },
  { path: 'details/:id', component: AccountDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
