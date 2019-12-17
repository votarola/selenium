@PagoWebPayMall
Feature: PagoWebPayMall

  Scenario Outline: PagoWebPayMall
    Given quiero realizar un pago por webpay mall
    When ingreso los montos y pago con <tarjeta>
    Then se realiza el pago

    Examples:
      | tarjeta   |
      | "377826100086878" |