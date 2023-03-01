import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {FriendRequestComponent} from "./component/friend-request/friend-request.component";


import {FriendlistComponent} from "./component/friendlist/friendlist.component";
import {AuthGuardService} from "../service/authentication/auth-guard.service";
import {SuggestListComponent} from "./component/suggest-list/suggest-list.component";


const routes: Routes = [
  {
    path: 'listFriend',
    component: FriendlistComponent,
    canActivate: [AuthGuardService]
  },
  {
    path: 'request',
    component: FriendRequestComponent,
    canActivate: [AuthGuardService]
  },
  {
    path: 'suggest',
    component: SuggestListComponent,
    canActivate: [AuthGuardService]
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FriendRoutingModule {
}
