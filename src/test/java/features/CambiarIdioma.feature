Feature: Cambiar idioma
Background:
  Given Inicio sesion en upf
  Then Ingreso correcto a la plataforma upf

@Ejemplo

Scenario: Cambiar idioma en plataforma upf
  Given me encuentro en el home de upf
  When Presiono el boton "Ca"
  Then Valido que se cambie el idioma a espanol



