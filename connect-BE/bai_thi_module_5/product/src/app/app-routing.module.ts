import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ListCarComponent} from './list-car/list-car.component';
import {EditCarComponent} from './edit-car/edit-car.component';


const routes: Routes = [
  {path: '', component: ListCarComponent},
  {path: 'edit/:id', component: EditCarComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
