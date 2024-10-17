import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeComponent } from './home.component';
import { Router } from '@angular/router';

describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;

  let  router:Router;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeComponent ]
    })
    .compileComponents();

     router = TestBed.inject(Router);

    fixture = TestBed.createComponent(HomeComponent);

   
    component = fixture.componentInstance;
    fixture.detectChanges();
  });


   it('test router obj',()=>{

    //  console.log(router)

      expect(router).toBeTruthy();

      console.log(fixture)

   });


  it('should create home comp', () => {
    expect(component).toBeTruthy();
  });

  it('test username',()=>{

      expect(component.username).toEqual('javeed');


  });


  it('test amout value',()=>{

    expect(component.amount).toBeGreaterThan(5000)


});



it('test getData func',()=>{

   let str =   component.getData();

    expect(str).toEqual('hello');

});


});
