#Github Users SpringBoot

#Swagger-UI:
http://localhost:8080/swagger-ui.html

#H2 console:
http://localhost:8080/h2-console </br>
JDBC URL: jdbc:h2:mem:testdb</br>
USER: sa </br>
PASSWORD: </br>

#Zadanie rekrutacyjne backend<br/>
Stwórz prosty RESTowy serwis, który zwróci informacje<br/>
Identyfikator<br/>
Login<br/>
Nazwa<br/>
Typ<br/>
Url do avatara<br/>
Data stworzenia<br/>
Obliczenia<br/>
API serwisu powinno wyglądać jak poniżej:<br/>
GET /users/{login}<br/>
{<br/>
"id": "...",<br/>
"login": "...",<br/>
"name": "…",<br/>
"type": "...",<br/>
"avatarUrl": „”,<br/>
"createdAt": "..."<br/>
"calculations": "..."<br/>
}<br/>
Serwis powinien pobrać dane z https://api.github.com/users/{login} (np. https://api.github.com/users/octocat) i przekazać je w API. W polu calculations powinien być zwrócony wynik działania 6 / liczba_followers * (2 + liczba_public_repos).<br/><br/>
Serwis powinien zapisywać w bazie danych liczbę wywołań API dla każdego loginu.<br/><br/>
Baza danych powinna zawierać dwie kolumny: LOGIN oraz REQUEST_COUNT. Dla każdego wywołania usługi wartość REQUEST_COUNT powinna być zwiększana o jeden.<br/><br/>
Serwis powinien być zaimplementowany w Java. Projekt powinien być możliwy do zbudowania za pomocą Maven lub Gradle. Możesz wspierać się dowolnymi, łatwo dostępnymi technologiami (silniki BD, biblioteki, frameworki).<br/><br/>
Pamiętaj o zastosowaniu dobrych praktyk programowania.<br/><br/>
Projekt umieść na dowolnym repozytorium i udostępnij nam link.<br/><br/>
