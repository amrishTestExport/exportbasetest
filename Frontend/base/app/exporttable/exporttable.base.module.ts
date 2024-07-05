import { NgModule } from '@angular/core';
import { BsModalService } from 'ngx-bootstrap/modal';
import { SharedModule } from '@app/shared/shared.module';
import { WidgetsBaseModule } from '@libbase/widgets.base.module';
import { ExportsModule } from '@app/exports/exports.module';
import { ExporttableListComponent } from '@app/exporttable/exporttable/exporttable-list/exporttable-list.component';
import { ExporttableDetailComponent } from '@app/exporttable/exporttable/exporttable-detail/exporttable-detail.component';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

@NgModule({
  declarations: [
    ExporttableListComponent,
    ExporttableDetailComponent
  ],
  imports: [
    SharedModule,
    WidgetsBaseModule,
    ExportsModule,
  ],
  exports: [
    SharedModule,
	WidgetsBaseModule,
    ExporttableListComponent,
    ExporttableDetailComponent
  ],
  providers: [
  	BsModalService,
	CanDeactivateGuard
  ],
  
})
export class ExporttableBaseModule { }