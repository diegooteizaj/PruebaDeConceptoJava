// Import our custom CSS
import '../scss/styles.scss';
// eslint-disable-next-line no-unused-vars
import bootstrap from 'bootstrap';

import Api from "./Api";
import Paises from "./Paises";
import Persona from "./Persona";
import { showError } from "../commons/Utils";

export default class App {
    constructor(config) {
        this.api = new Api(config);

        this.persona = new Persona({ idTablaPersona: 'persona', api: this.api, ...config });

        this.renderPersona();
    }

    renderPersona() {
        this.api.obtenerPersona()
            .then(persona => {
                this.persona.render(persona);
            })
            .catch(error => {
                showError(error);
            });
    }
}

// eslint-disable-next-line no-undef
globalThis.app = new App(config);
