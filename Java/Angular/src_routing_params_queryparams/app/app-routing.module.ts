import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PaymentComponent } from './payment/payment.component';

const routes: Routes = [ 
  
                {"path":'home' , component:HomeComponent} ,
                {"path":'aboutus/:name',component:AboutusComponent},
                {"path":'contact',component:ContactusComponent },
                {"path":'payment/:amount',component:PaymentComponent}

                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
