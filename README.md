# Spring-example-2

Small spring project showcase.

Project source (Variables i.e.) in FINNISH Language.

* Created with Eclipse Java EE IDE Oxygen.3a
* Simple Apache Maven (4.0.0) Spring framework project.
* With following dependencies:
* Spring-core 5.0.6
* Spring-beans 5.0.6
* Spring-context 5.0.

Displaying the usage of:
* ApplicationContext (Beanfactory container) 
* How to set properties of bean in Spring Bean Configuration XML file via 
* How to set bean constructor arguments in Spring Bean Configuration XML file via 
* How to do simple dependency injection (injecting Terms dependency to Customer class)

What's new compared to "Spring-example":
* Usage of init & destroy-methods.
* Usage of HashMap set method in bean (Online.java)
* Usage of ArrayList in constructor @ Henkilo bean (Henkilo.java)

<b> UML-structure of the "project":</b>

<a href="https://imgbb.com/"><img src="https://image.ibb.co/iChgf8/spring_uml.png" alt="spring_uml" border="0"></a>

Prints out "list of online shoppers - with further (shopping cart & payment) details", like so:




Online: false
-----------
Henkilo : 
 STT: 1111556
 etunimi: Leon
 sukunimi: Björklund

ostoskori:
Lippalakki
Sukat
Boxerit
Aurinkolasit

LaskutusTiedot: 
 osoite: Kuulakuja 2 B 3, 00250 Helsinki
 maksuaika: 45
 saldo: -150'
