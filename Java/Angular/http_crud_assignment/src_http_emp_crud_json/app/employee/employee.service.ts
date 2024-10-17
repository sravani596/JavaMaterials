import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }


      baseURL = "http://localhost:3000/employees"

    getAllEmployees():Observable<Employee[]>{

      return this.http.get<Employee[]>(this.baseURL);

    }


    insert(emp:Employee):Observable<Employee>{


        console.log(emp)

       return this.http.post<Employee>(this.baseURL,emp);  // emp is added to request body


     //  return this.http.put<Employee>(this.baseURL+`/${emp.id}`,emp); 

    }


      search(input:any):Observable<Employee>{

        console.log('service ',input)

         return this.http.get<Employee>(this.baseURL+`/${input.id}`);

       // return  this.http.delete<Employee>(this.baseURL+`/${input.id}`);

      }


        deleteById(id:number):Observable<Employee>{

          return  this.http.delete<Employee>(this.baseURL+`/${id}`);

        }



      



}
