import { ExporttableBase} from '@baseapp/exporttable/exporttable/exporttable.base.model';

export class ExporttableApiConstants {
    public static readonly update: any = {
        url: '/rest/exporttables/',
        method: 'PUT',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/exporttables/',
        method: 'POST',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/exporttables/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly getDatatableData: any = {
        url: '/rest/exporttables/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly getByName: any = {
        url: '/rest/exporttables/byname/{name}',
        method: 'GET',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/exporttables/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/exporttables/{sid}',
        method: 'GET',
        showloading: true
    };
}