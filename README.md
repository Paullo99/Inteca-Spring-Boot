## Inteca-Spring-Boot
Zadanie ewaluacyjne na młodszego programistę JAVA

#### Technologie:
- SpringBoot,
- MySQL.

#### Implementacja składa się z 3 osobnych aplikacji:
- CreditSpringApp,
- CustomerSpringApp,
- ProductSpringApp.

Poniżej znajdują się 2 główne end-pointy aplikacji (uruchomione za pomocą środowiska IDE):
- getCredits (GET):

![getCredits](https://user-images.githubusercontent.com/49610728/117638706-6b106200-b183-11eb-8e35-39985a492f12.png)

- createCredit (POST) - zwraca ID utworzonego kredytu: 

![createCredit](https://user-images.githubusercontent.com/49610728/117638712-6ba8f880-b183-11eb-8f97-06e8bf8de0e2.png)

Dockeryzacja: udało się utworzyć Dockerfile dla każdej aplikacji oraz wspólny docker-compose.yml. Niestety występuje problem z połączeniem do bazy danych.
