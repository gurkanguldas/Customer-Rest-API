# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#actuator)
* [Validation](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#io.validation)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
## Endpoint
#### 1. Calling All Customers
<font size="4">

```
GET /customer/rest/api/getcustomers
```

</font> 
<font size="2">

<table>
  <tr style="background-color:#f0f0ff">
    <th>Name</th>
    <th>Type</th>
    <th>Mandatory</th>
    <th>Default Value</th>
    <th>Other Values</th>
  </tr>
  <tr>
    <td>sortType</td>
    <td>String</td>
    <td>false</td>
    <td>id</td>
    <td>id, nickname, customerInfo.name, customerInfo.surname,<br> 
        customerInfo.gender, customerInfo.dateOfBirth,<br>
        customerInfo.identificationNumber, customerContact.country,<br>
        customerContact.city, customerContact.disrict,<br>
        customerContact.adress, customerContact.phoneNumber
        </td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td>descending</td>
    <td>boolean</td>
    <td>false</td>
    <td>false</td>
    <td>true, false</td>
  </tr>
  <tr>
    <td>pageSize</td>
    <td>int</td>
    <td>false</td>
    <td>10</td>
    <td>5, 10, 25, 50, 100 ...</td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td>pageNo</td>
    <td>int</td>
    <td>false</td>
    <td>0</td>
    <td>0 - ∞</td>
  </tr>
  <tr>
    <td>quary</td>
    <td>String</td>
    <td>false</td>
    <td>greater_than_or_equal</td>
    <td>between, like, in, equals, not_equals,<br> greater_than_or_equal, less_than_or_equal</td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td>table</td>
    <td>String</td>
    <td>false</td>
    <td>customer</td>
    <td>customer, customer_information, customer_contact</td>
  </tr>
  <tr>
    <td>column</td>
    <td>String</td>
    <td>false</td>
    <td>id</td>
    <td>id, nickname, name, surname, gender, dateOfBirth,<br>
        identificationNumber, country,city, disrict,adress, phoneNumber
        </td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td>value1</td>
    <td>Object</td>
    <td>false</td>
    <td>0</td>
    <td>Everything</td>
  </tr>
  <tr>
    <td>value2</td>
    <td>Object</td>
    <td>false</td>
    <td>0</td>
    <td>Everything</td>
  </tr>
</table>

</font> 

<font size="4">

```
GET /customer/rest/api/getcustomers
```
</font> 

<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;succesful&quot;</span>: <span style="color: #008000; font-weight: bold">true</span>,
  <span style="color: #008000; font-weight: bold">&quot;code&quot;</span>: <span style="color: #BA2121">&quot;getCustomers&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;message&quot;</span>: <span style="color: #BA2121">&quot;The customer list has been successfully called up.&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;result&quot;</span>: [
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">1</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;yagizaybar65&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;IsrF16eJ7amxIc2&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">1</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Yağız Erkân&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Aybar&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1970-09-17&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">20781401532</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">1</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;GİRESUN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;BULANCAK&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;AHMETLİ KÖYÜ MAH.MERKEZ MEVKİ SOKAK NO:19 93072 BULANCAK/GİRESUN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905456974246</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">2</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;celâleddindaglaroglu20&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;nBy8n5HCqq7&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">2</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Celâleddin Asil&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Dağlaroğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1989-08-01&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">27255242181</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">2</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;TEKİRDAĞ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ÇERKEZKÖY&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;GAZİ MUSTAFA KEMALPAŞA MAH.ŞEKER SOKAK NO:717 110896 ÇERKEZKÖY/TEKİRDAĞ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905442480200</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">3</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;seybangonultas17&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;9la33LwmbX&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">3</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Şeyban Altan&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Gönültaş&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1967-11-28&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">17523295028</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">3</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;KONYA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;SELÇUKLU&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;BÜYÜKKAYACIK MAH.ORMANSEVEN SOKAK NO:816 100632 SELÇUKLU/KONYA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905421818316</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">4</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;nihataybar42&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;G39gWvNCQARu&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">4</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Nihat Cihad&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Aybar&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;2006-01-21&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">10328328145</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">4</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;MERSİN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;AKDENİZ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;KARACAİLYAS MAH.2971. SOKAK NO:363 119645 AKDENİZ/MERSİN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905456612249</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">5</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;ensarakisik53&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;sW56afU3F0aCT5N&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">5</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Ensar Agâh&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Akışık&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1997-06-17&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">18390353664</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">5</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ADALAR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;KINALIADA MAH.MANASTIRALTI KÜME EVLERİ SOKAK NO:211 95630 ADALAR/İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905471484248</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">6</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;samiyildizoglu60&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;PV4ai8rmI72g8cgJ&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">6</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Sami Ercan&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Yıldızoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1949-01-16&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">13958337237</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">6</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ÜMRANİYE&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ÇAKMAK MAH.MEKAN SOKAK NO:683 96252 ÜMRANİYE/İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905453959833</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">7</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;hayalipektemek43&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;4E2Hsy8rdHx&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">7</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Hayali Gürkan&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Pektemek&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1944-04-07&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">10676447910</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">7</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ARNAVUTKÖY&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ANADOLU MAH.GELİBOLU CADDESİ SOKAK NO:560 119236 ARNAVUTKÖY/İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905434302266</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">8</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;atalaykocoglu2&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;8cEqf55s46&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">8</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Atalay Türkeş&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Koçoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;2000-06-23&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">22994273077</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">8</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;EYÜP&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;GÜZELTEPE MAH.YENİ DUVAR SOKAK NO:542 95830 EYÜP/İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905371975315</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">9</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;vehbibarbarosoglu7&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;6lL4m60uc&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">9</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Vehbi Şihab&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Barbarosoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;2008-01-10&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">13604908183</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">9</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ADANA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;YÜREĞİR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ULUBATLI HASAN MAH.3051. SOKAK NO:501 78213 YÜREĞİR/ADANA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905364701754</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">10</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;tumerhamzaoglu51&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;4vv5Xc5jKLRt34H8v&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">10</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Tümer Özden&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Hamzaoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1957-05-02&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">24087597079</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">10</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;HATAY&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;İSKENDERUN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;NARDÜZÜ-NESLİ MAH.186. SOKAK NO:837 94364 İSKENDERUN/HATAY&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905515456072</span>
      }
    }
  ]
}
</pre></div>

######

<font size="4">

```
GET /customer/rest/api/getcustomers?type=nickname&descending=true&size=5
```
</font> 

<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;succesful&quot;</span>: <span style="color: #008000; font-weight: bold">true</span>,
  <span style="color: #008000; font-weight: bold">&quot;code&quot;</span>: <span style="color: #BA2121">&quot;getCustomers&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;message&quot;</span>: <span style="color: #BA2121">&quot;The customer list has been successfully called up.&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;result&quot;</span>: [
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">326</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;zumrutpektemek25&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;Q2yjs77rQ&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">326</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Zümrüt Berçin&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Pektemek&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1941-07-27&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">17677987263</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">326</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;KASTAMONU&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;DADAY&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;KAYABAĞI KÖYÜ MAH.KARŞI MEVKİ SOKAK NO:335 98318 DADAY/KASTAMONU&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905458633366</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">498</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;zumrutakbulut2&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;T15J53hOVi3470u&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">498</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Zümrüt&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Akbulut&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1965-08-19&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">24645342730</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">498</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;TEKİRDAĞ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ÇORLU&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;AHİMEHMET KÖYÜ MAH.13. SOKAK NO:185 110944 ÇORLU/TEKİRDAĞ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905361588334</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">442</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;zuleyhaerberk53&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;HQiGMu2X&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">442</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Züleyha&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Erberk&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1997-05-27&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">21197941850</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">442</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;BALIKESİR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;BALYA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ENVERPAŞA MAH.NALBANT ABDULLAH KANDEMİR SOKAK NO:211 83675 BALYA/BALIKESİR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905447875840</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">451</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;zulalbarbarosoglu73&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;THMUftrA0&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">451</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Zülal&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Barbarosoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;2006-06-01&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">27927916459</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">451</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;GAZİOSMANPAŞA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;HÜRRİYET MAH.315. SOKAK NO:696 95968 GAZİOSMANPAŞA/İSTANBUL&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905356944120</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">372</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;zubeydekarabocek78&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;4pSr48itf042&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">372</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Zübeyde&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Karaböcek&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1979-03-12&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">28881181045</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">372</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;AFYONKARAHİSAR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;HOCALAR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;YEŞİLHİSAR-CUMHURİYET MAH.CİHAN SOKAK NO:161 79640 HOCALAR/AFYONKARAHİSAR&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905348544803</span>
      }
    }
  ]
}
</pre></div>

######

<font size="4">

```
GET /customer/rest/api/getcustomers?type=nickname&size=5&page=2&quary=equals&table=customer_contact&column=city&start_value=ANKARA
```
</font> 

<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;succesful&quot;</span>: <span style="color: #008000; font-weight: bold">true</span>,
  <span style="color: #008000; font-weight: bold">&quot;code&quot;</span>: <span style="color: #BA2121">&quot;getCustomers&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;message&quot;</span>: <span style="color: #BA2121">&quot;The customer list has been successfully called up.&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;result&quot;</span>: [
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">478</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;julidecetin71&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;Y848cHGSKBOBMdJ&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">478</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Julide&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Çetin&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1996-02-01&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">26516876938</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">478</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ÇANKAYA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ÜNİVERSİTELER MAH.1614. SOKAK NO:288 80988 ÇANKAYA/ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905391239034</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">463</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;julideozkok9&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;EQuVtT7wD9oIUOW&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">463</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Julide&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Özkök&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;2003-09-28&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">23265857397</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">463</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ETİMESGUT&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;GÜZELKENT MAH.720. SOKAK NO:362 125556 ETİMESGUT/ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905442818001</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">144</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;kadirsozeri56&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;Sx2WbXKU6&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">144</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Kadir &quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Sözeri&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1969-06-10&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">27229413142</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">144</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;KEÇİÖREN&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ESERTEPE MAH.303. SOKAK NO:50 81084 KEÇİÖREN/ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905498780620</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">455</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;nazanbasoglu78&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;l7HpO3y0V&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">455</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Nazan&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Başoğlu&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;woman&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1975-04-20&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">28895114221</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">455</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;ALTINDAĞ&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ALEMDAĞ MAH.1042/1 SOKAK NO:799 80827 ALTINDAĞ/ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905377225829</span>
      }
    },
    {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">170</span>,
      <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;necibbademci36&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;y3CUlL5BfXeRIBOW&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">170</span>,
        <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Necib &quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Bademci&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1958-09-17&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">11746434403</span>
      },
      <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
        <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">170</span>,
        <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;KIZILCAHAMAM&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;GÜNEYSARAY KÖYÜ MAH.KÖYÜN KENDİSİ SOKAK NO:895 123962 KIZILCAHAMAM/ANKARA&quot;</span>,
        <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905387578561</span>
      }
    }
  ]
}
</pre></div>

######

<font size="4">

```
GET /customer/rest/api/getcustomer
```
</font>

<font size="2">

<table>
  <tr style="background-color:#f0f0ff">
    <th>Name</th>
    <th>Type</th>
    <th>Mandatory</th>
    <th>Values</th>
  </tr>
  <tr>
    <td>id</td>
    <td>Long</td>
    <td>true</td>
    <td>1 - ∞</td>
  </tr>
  
</table>

</font>
 
######

<font size="4">

```
GET /customer/rest/api/getcustomer?id=25
```
</font>

<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;succesful&quot;</span>: <span style="color: #008000; font-weight: bold">true</span>,
  <span style="color: #008000; font-weight: bold">&quot;code&quot;</span>: <span style="color: #BA2121">&quot;getCustomerById&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;message&quot;</span>: <span style="color: #BA2121">&quot;Customer ID 25 was successfully returned.&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;result&quot;</span>: {
    <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">25</span>,
    <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;ertugrulakyuz50&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;YhM4QF86H&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">25</span>,
      <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Ertuğrul Ali&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Akyüz&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1997-04-11&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">13736613104</span>
    },
    <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">25</span>,
      <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;ERZURUM&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;YAKUTİYE&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;ÖMER NASUHİ BİLMEN MAH.FERAH SOKAK NO:883 119134 YAKUTİYE/ERZURUM&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905422950976</span>
    }
  }
}
</pre></div>
######

<font size="4">

```
POST /customer/rest/api/addcustomer
```
</font>

<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">0</span>,
  <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
    <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">0</span>,
    <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;yyyy-mm-dd&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">0</span>
  },
  <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
    <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">0</span>,
    <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;string&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">0</span>
  }
}
</pre></div>

######

<font size="4">

```
DELETE /customer/rest/api/deletecustomer
```
</font>

<font size="2">

<table>
  <tr style="background-color:#f0f0ff">
    <th>Name</th>
    <th>Type</th>
    <th>Mandatory</th>
    <th>Values</th>
  </tr>
  <tr>
    <td>id</td>
    <td>Long</td>
    <td>true</td>
    <td>1 - ∞</td>
  </tr>
  
</table>

</font>
 
######

<font size="4">

```
DELETE /customer/rest/api/deletecustomer?id=20
```
</font>



<!-- HTML generated using hilite.me -->
<div style="background: #f8f8f8; overflow:auto;width:auto;border-width:.1em .1em .1em .8em;background: #f2f2f2;max-height: 400px;"><pre style="margin: 0; line-height: 125%">{
  <span style="color: #008000; font-weight: bold">&quot;succesful&quot;</span>: <span style="color: #008000; font-weight: bold">true</span>,
  <span style="color: #008000; font-weight: bold">&quot;code&quot;</span>: <span style="color: #BA2121">&quot;deleteCustomerById&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;message&quot;</span>: <span style="color: #BA2121">&quot;The customer with ID number 20 was deleted.&quot;</span>,
  <span style="color: #008000; font-weight: bold">&quot;result&quot;</span>: {
    <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">20</span>,
    <span style="color: #008000; font-weight: bold">&quot;nickname&quot;</span>: <span style="color: #BA2121">&quot;hurkansozeri71&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;password&quot;</span>: <span style="color: #BA2121">&quot;044x1Yt0eoQ&quot;</span>,
    <span style="color: #008000; font-weight: bold">&quot;customerInfo&quot;</span>: {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">20</span>,
      <span style="color: #008000; font-weight: bold">&quot;name&quot;</span>: <span style="color: #BA2121">&quot;Hürkan İhvan&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;surname&quot;</span>: <span style="color: #BA2121">&quot;Sözeri&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;gender&quot;</span>: <span style="color: #BA2121">&quot;man&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;dateOfBirth&quot;</span>: <span style="color: #BA2121">&quot;1993-07-05&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;identificationNumber&quot;</span>: <span style="color: #666666">21831255161</span>
    },
    <span style="color: #008000; font-weight: bold">&quot;customerContact&quot;</span>: {
      <span style="color: #008000; font-weight: bold">&quot;id&quot;</span>: <span style="color: #666666">20</span>,
      <span style="color: #008000; font-weight: bold">&quot;country&quot;</span>: <span style="color: #BA2121">&quot;Turkey&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;city&quot;</span>: <span style="color: #BA2121">&quot;MANİSA&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;disrict&quot;</span>: <span style="color: #BA2121">&quot;AHMETLİ&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;adress&quot;</span>: <span style="color: #BA2121">&quot;GÖKKAYA-SÜLEYMAN SUAT MAH.ASMALI SOKAK NO:447 103100 AHMETLİ/MANİSA&quot;</span>,
      <span style="color: #008000; font-weight: bold">&quot;phoneNumber&quot;</span>: <span style="color: #666666">905387346569</span>
    }
  }
}
</pre></div>
