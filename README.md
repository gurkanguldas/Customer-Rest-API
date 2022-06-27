
## Endpoint
#### 1. Calling All Customers

```
GET /customer/rest/api/getcustomers
```


<table>
  <tr style="background-color:#f0f0ff">
    <th><sub>Name</sub></th>
    <th><sub>Type</sub></th>
    <th><sub>Mandatory</sub></th>
    <th><sub>Default Value</sub></th>
    <th><sub>Other Values</sub></th>
  </tr>
  <tr>
    <td><sub>sortType</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>id</sub></td>
    <td>
    <sub>
        id, nickname, customerInfo.name, customerInfo.surname, customerInfo.gender, <br />customerInfo.dateOfBirth,
        customerInfo.identificationNumber,<br /> customerContact.country,
        customerContact.city, customerContact.disrict,<br />
        customerContact.adress, customerContact.phoneNumber
    </sub>
    </td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>descending</sub></td>
    <td><sub>boolean</sub></td>
    <td><sub>false</sub></td>
    <td><sub>false</sub></td>
    <td><sub>true, false</sub></td>
  </tr>
  <tr>
    <td><sub>pageSize</sub></td>
    <td><sub>int</sub></td>
    <td><sub>false</sub></td>
    <td><sub>10</sub></td>
    <td><sub>5, 10, 25, 50, 100 ...</sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>pageNo</sub></td>
    <td><sub>int</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>0 - ∞</sub></td>
  </tr>
  <tr>
    <td><sub>quary</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>greater_than_or_equal</sub></td>
    <td><sub>between, like, in, equals, not_equals,<br> greater_than_or_equal, less_than_or_equal</sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>table</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>customer</sub></td>
    <td><sub>customer, customer_information, customer_contact</sub></td>
  </tr>
  <tr>
    <td><sub>column</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>id</sub></td>
    <td><sub>id, nickname, name, surname, gender, dateOfBirth,<br>
        identificationNumber, country,city, disrict,adress, phoneNumber
        </sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>value1</sub></td>
    <td><sub>Object</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>Everything</sub></td>
  </tr>
  <tr>
    <td><sub>value2</sub></td>
    <td><sub>Object</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>Everything</sub></td>
  </tr>
</table>

```
GET /customer/rest/api/getcustomers
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "getCustomers",
  "message": "The customer list has been successfully called up.",
  "result": [
    {
      "id": 1,
      "nickname": "yagizaybar65",
      "password": "IsrF16eJ7amxIc2",
      "customerInfo": {
        "id": 1,
        "name": "Yağız Erkân",
        "surname": "Aybar",
        "gender": "man",
        "dateOfBirth": "1970-09-17",
        "identificationNumber": 20781401532
      },
      "customerContact": {
        "id": 1,
        "country": "Turkey",
        "city": "GİRESUN",
        "disrict": "BULANCAK",
        "adress": "AHMETLİ KÖYÜ MAH.MERKEZ MEVKİ SOKAK NO:19 93072 BULANCAK/GİRESUN",
        "phoneNumber": 905456974246
      }
    },
    {
      "id": 2,
      "nickname": "celâleddindaglaroglu20",
      "password": "nBy8n5HCqq7",
      "customerInfo": {
        "id": 2,
        "name": "Celâleddin Asil",
        "surname": "Dağlaroğlu",
        "gender": "man",
        "dateOfBirth": "1989-08-01",
        "identificationNumber": 27255242181
      },
      "customerContact": {
        "id": 2,
        "country": "Turkey",
        "city": "TEKİRDAĞ",
        "disrict": "ÇERKEZKÖY",
        "adress": "GAZİ MUSTAFA KEMALPAŞA MAH.ŞEKER SOKAK NO:717 110896 ÇERKEZKÖY/TEKİRDAĞ",
        "phoneNumber": 905442480200
      }
    },
    {
      "id": 3,
      "nickname": "seybangonultas17",
      "password": "9la33LwmbX",
      "customerInfo": {
        "id": 3,
        "name": "Şeyban Altan",
        "surname": "Gönültaş",
        "gender": "man",
        "dateOfBirth": "1967-11-28",
        "identificationNumber": 17523295028
      },
      "customerContact": {
        "id": 3,
        "country": "Turkey",
        "city": "KONYA",
        "disrict": "SELÇUKLU",
        "adress": "BÜYÜKKAYACIK MAH.ORMANSEVEN SOKAK NO:816 100632 SELÇUKLU/KONYA",
        "phoneNumber": 905421818316
      }
    },
    {
      "id": 4,
      "nickname": "nihataybar42",
      "password": "G39gWvNCQARu",
      "customerInfo": {
        "id": 4,
        "name": "Nihat Cihad",
        "surname": "Aybar",
        "gender": "man",
        "dateOfBirth": "2006-01-21",
        "identificationNumber": 10328328145
      },
      "customerContact": {
        "id": 4,
        "country": "Turkey",
        "city": "MERSİN",
        "disrict": "AKDENİZ",
        "adress": "KARACAİLYAS MAH.2971. SOKAK NO:363 119645 AKDENİZ/MERSİN",
        "phoneNumber": 905456612249
      }
    },
    {
      "id": 5,
      "nickname": "ensarakisik53",
      "password": "sW56afU3F0aCT5N",
      "customerInfo": {
        "id": 5,
        "name": "Ensar Agâh",
        "surname": "Akışık",
        "gender": "man",
        "dateOfBirth": "1997-06-17",
        "identificationNumber": 18390353664
      },
      "customerContact": {
        "id": 5,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ADALAR",
        "adress": "KINALIADA MAH.MANASTIRALTI KÜME EVLERİ SOKAK NO:211 95630 ADALAR/İSTANBUL",
        "phoneNumber": 905471484248
      }
    },
    {
      "id": 6,
      "nickname": "samiyildizoglu60",
      "password": "PV4ai8rmI72g8cgJ",
      "customerInfo": {
        "id": 6,
        "name": "Sami Ercan",
        "surname": "Yıldızoğlu",
        "gender": "man",
        "dateOfBirth": "1949-01-16",
        "identificationNumber": 13958337237
      },
      "customerContact": {
        "id": 6,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ÜMRANİYE",
        "adress": "ÇAKMAK MAH.MEKAN SOKAK NO:683 96252 ÜMRANİYE/İSTANBUL",
        "phoneNumber": 905453959833
      }
    },
    {
      "id": 7,
      "nickname": "hayalipektemek43",
      "password": "4E2Hsy8rdHx",
      "customerInfo": {
        "id": 7,
        "name": "Hayali Gürkan",
        "surname": "Pektemek",
        "gender": "man",
        "dateOfBirth": "1944-04-07",
        "identificationNumber": 10676447910
      },
      "customerContact": {
        "id": 7,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ARNAVUTKÖY",
        "adress": "ANADOLU MAH.GELİBOLU CADDESİ SOKAK NO:560 119236 ARNAVUTKÖY/İSTANBUL",
        "phoneNumber": 905434302266
      }
    },
    {
      "id": 8,
      "nickname": "atalaykocoglu2",
      "password": "8cEqf55s46",
      "customerInfo": {
        "id": 8,
        "name": "Atalay Türkeş",
        "surname": "Koçoğlu",
        "gender": "man",
        "dateOfBirth": "2000-06-23",
        "identificationNumber": 22994273077
      },
      "customerContact": {
        "id": 8,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "EYÜP",
        "adress": "GÜZELTEPE MAH.YENİ DUVAR SOKAK NO:542 95830 EYÜP/İSTANBUL",
        "phoneNumber": 905371975315
      }
    },
    {
      "id": 9,
      "nickname": "vehbibarbarosoglu7",
      "password": "6lL4m60uc",
      "customerInfo": {
        "id": 9,
        "name": "Vehbi Şihab",
        "surname": "Barbarosoğlu",
        "gender": "man",
        "dateOfBirth": "2008-01-10",
        "identificationNumber": 13604908183
      },
      "customerContact": {
        "id": 9,
        "country": "Turkey",
        "city": "ADANA",
        "disrict": "YÜREĞİR",
        "adress": "ULUBATLI HASAN MAH.3051. SOKAK NO:501 78213 YÜREĞİR/ADANA",
        "phoneNumber": 905364701754
      }
    },
    {
      "id": 10,
      "nickname": "tumerhamzaoglu51",
      "password": "4vv5Xc5jKLRt34H8v",
      "customerInfo": {
        "id": 10,
        "name": "Tümer Özden",
        "surname": "Hamzaoğlu",
        "gender": "man",
        "dateOfBirth": "1957-05-02",
        "identificationNumber": 24087597079
      },
      "customerContact": {
        "id": 10,
        "country": "Turkey",
        "city": "HATAY",
        "disrict": "İSKENDERUN",
        "adress": "NARDÜZÜ-NESLİ MAH.186. SOKAK NO:837 94364 İSKENDERUN/HATAY",
        "phoneNumber": 905515456072
      }
    }
  ]
}
```

</details>



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
