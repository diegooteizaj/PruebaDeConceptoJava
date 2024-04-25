import DataTable from 'datatables.net';
import 'datatables.net-dt/css/jquery.dataTables.min.css';
import $ from "jquery";

export default class Persona {
    constructor(config) {
        this.api = config.api;
        this.idTablaPersona = config.idTablaPersona;
    }

    render(persona) {
        this.tablaPersona = new DataTable(`#${this.idTablaPersona}`, {
            data: persona,
            autoWidth: true,
            responsive: true,
            language: {
                url: `${this.api.getContext()}/DataTables/i18n/es-CL.json`,
            },
            columns: [
                {
                    data: "id",
                    render: (data, type, row) => data
                },
                {
                    data: "nombre",
                    render: (data, type, row) => data
                },
                {
                    data: "apellido",
                    render: (data, type, row) => data
                },
                {
                    data: "pais",
                    render: (data, type, row) => data
                },
                {
                    data: "editar",
                    render: (data, type, row) => data
                },
                {
                    data: "eliminar",
                    render: (data, type, row) => data
                }

            ],
            dom: '<"datatable-header"fl><"datatable-scroll-wrap"t><"datatable-footer"ip>'
        });
    }
}
