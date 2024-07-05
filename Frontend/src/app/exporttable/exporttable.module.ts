import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ExporttableRoutingModule } from './exporttable-routing.module';
import { ExporttableBaseModule } from '@baseapp/exporttable/exporttable.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    ExporttableBaseModule,
    ExporttableRoutingModule
    
  ],
  exports: [
      ExporttableBaseModule,
  ]

})
export class ExporttableModule  { }