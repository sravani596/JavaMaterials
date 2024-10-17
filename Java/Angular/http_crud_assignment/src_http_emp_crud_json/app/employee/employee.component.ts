import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers:[EmployeeService]
})
export class EmployeeComponent {

   

      empList:Employee[] = [];

      emp: Employee = {'id':0,'ename':"",'salary':0}

        constructor(private service:EmployeeService){


        }

        getAllData(){

         this.service.getAllEmployees().subscribe( (inputs)=>{   this.empList = inputs; } );


        }


        insertEmp(emp:Employee){

          console.log(emp)

            this.service.insert(emp).subscribe( (e1)=>{ console.log("Employee Added ",e1)})

          

        }

        search(input:any){

            console.log(input)

              this.service.search(input).subscribe( (e1)=>{  console.log("Data found ",e1); })

          

        }


          deleteById(id:number){

              this.service.deleteById(id).subscribe( (e1)=>{console.log('deleted record successfully ')});

                this.getAllData();


          }



}
