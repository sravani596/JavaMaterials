import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'hello',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{  // controllers
  title = 'myapp';

   registerForm!: FormGroup;


   submitted:boolean = false;

   constructor(private formBuilder:FormBuilder){  // dependency injection
  }


  ngOnInit(): void {
   
       this.registerForm =   this.formBuilder.group({

                  username:['',[Validators.required,Validators.minLength(4)]  ],
                 
                  email:['' , [Validators.required , Validators.email] ]  ,

                  password:['', [Validators.required, Validators.minLength(4),Validators.maxLength(10)]]


                  });
  }


    // convenience getter   f() for easy access to form fields
      get f() { 
        return this.registerForm.controls; 
      }   


      // <span  *ngIf="this.registerForm.controls.username">  or  <span  *ngIf="f.username">

      onSubmit(){

          this.submitted = true;

            if(this.registerForm.invalid){
                  return;
            }

            alert('Registration Successful..');

            console.log(this.registerForm.value)

            console.log(this.registerForm.controls)

      }


}




