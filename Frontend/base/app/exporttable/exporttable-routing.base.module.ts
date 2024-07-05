import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

import { ExporttableListComponent } from '@app/exporttable/exporttable/exporttable-list/exporttable-list.component';
import { ExporttableDetailComponent } from '@app/exporttable/exporttable/exporttable-detail/exporttable-detail.component';

export const routes: Routes = [

{
     path: 'exporttablelist',
     component: ExporttableListComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "EXPORTTABLE_LIST",
        breadcrumb: "EXPORTTABLE_LIST",
        roles : [					"all"
				]
     }
},
{
     path: 'exporttabledetail',
     component: ExporttableDetailComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "EXPORTTABLE_DETAIL",
        breadcrumb: "EXPORTTABLE_DETAIL",
        roles : [					"all"
				]
     }
}
];

@NgModule({
  imports: [ RouterModule.forChild(routes) ],
  exports: [ RouterModule ]
})
export class ExporttableBaseRoutingModule
{
}
