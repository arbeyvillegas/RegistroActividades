"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var registro_actividad_component_1 = require('./actividades/registro-actividad.component');
var consulta_actividad_component_1 = require('./actividades/consulta-actividad.component');
var docente_service_1 = require("../servicios/actividades/docente.service");
var tipo_actividad_service_1 = require("../servicios/actividades/tipo-actividad.service");
var semestre_service_1 = require("../servicios/actividades/semestre.service");
var dsc_service_1 = require("../servicios/actividades/dsc.service");
var reporte_actividad_service_1 = require("../servicios/actividades/reporte-actividad.service");
var router_deprecated_1 = require('@angular/router-deprecated');
var http_1 = require('@angular/http');
var AppComponent = (function () {
    function AppComponent() {
    }
    AppComponent = __decorate([
        core_1.Component({
            selector: 'my-app',
            templateUrl: "app/modulos/app.component.html",
            directives: [router_deprecated_1.ROUTER_DIRECTIVES],
            providers: [
                router_deprecated_1.ROUTER_PROVIDERS,
                http_1.HTTP_PROVIDERS,
                docente_service_1.DocenteService,
                tipo_actividad_service_1.TipoActividadService,
                semestre_service_1.SemestreService,
                dsc_service_1.DscService,
                reporte_actividad_service_1.ReporteActividadService
            ]
        }),
        router_deprecated_1.RouteConfig([
            {
                path: '/registroactividad',
                name: 'RegistroActividad',
                component: registro_actividad_component_1.RegistroActividadComponent
            },
            {
                path: '/edicionactividad/:id',
                name: 'EdicionActividad',
                component: registro_actividad_component_1.RegistroActividadComponent
            },
            {
                path: '/consultaactividad',
                name: 'ConsultaActividad',
                component: consulta_actividad_component_1.ConsultaActividadComponent
            },
            {
                path: '/consultaactividadfecha/:fecha',
                name: 'ConsultaActividadFecha',
                component: consulta_actividad_component_1.ConsultaActividadComponent
            },
        ]), 
        __metadata('design:paramtypes', [])
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map