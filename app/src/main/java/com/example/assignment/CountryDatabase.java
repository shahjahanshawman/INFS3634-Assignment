package com.example.assignment;

public class CountryDatabase {


    //contains all the countries, flags and difficulty information for the quiz
    ////link from where flag images are being taken--->https://www.countries-ofthe-world.com/flags-of-the-world.html

    int[] flags = {
        R.drawable.afghanistan,
        R.drawable.albania,
        R.drawable.algeria,
        R.drawable.andorra,
        R.drawable.angola,
        R.drawable.antiguaandbarbuda,
        R.drawable.argentina,
        R.drawable.armenia,
        R.drawable.australia,
        R.drawable.austria,
        R.drawable.azerbaijan,
        R.drawable.bahamasthe,
        R.drawable.bahrain,
        R.drawable.bangladesh,
        R.drawable.barbados,
        R.drawable.belarus,
        R.drawable.belgium,
        R.drawable.belize,
        R.drawable.benin,
        R.drawable.bhutan,
        R.drawable.bolivia,
        R.drawable.bosniaandherzegovina,
        R.drawable.botswana,
        R.drawable.brazil,
        R.drawable.brunei,
        R.drawable.bulgaria,
        R.drawable.burkina_faso,
        R.drawable.burundi,
        R.drawable.cambodia,
        R.drawable.cameroon,
        R.drawable.canada,
        R.drawable.cape_verde,
        R.drawable.central_african_republic,
        R.drawable.chad,
        R.drawable.chile,
        R.drawable.china,
        R.drawable.colombia,
        R.drawable.comoros,
        R.drawable.congo,
        R.drawable.costa_rica,
        R.drawable.croatia,
        R.drawable.cuba,
        R.drawable.cyprus,
        R.drawable.czech_republic,
        R.drawable.democratic_republic_of_the_congo,
        R.drawable.denmark,
        R.drawable.djibouti,
        R.drawable.dominica,
        R.drawable.dominican_republic,
        R.drawable.east_timor,
        R.drawable.ecuador,
        R.drawable.egypt,
        R.drawable.el_salvador,
        R.drawable.equatorial_guinea,
        R.drawable.eritrea,
        R.drawable.estonia,
        R.drawable.eswatini,
        R.drawable.ethiopia,
        R.drawable.fiji,
        R.drawable.finland,
        R.drawable.france,
        R.drawable.gabon,
        R.drawable.georgia,
        R.drawable.germany,
        R.drawable.ghana,
        R.drawable.greece,
        R.drawable.grenada,
        R.drawable.guatemala,
        R.drawable.guinea,
        R.drawable.guinea_bissau,
        R.drawable.guyana,
        R.drawable.haiti,
        R.drawable.honduras,
        R.drawable.hungary,
        R.drawable.iceland,
        R.drawable.india,
        R.drawable.indonesia,
        R.drawable.iran,
        R.drawable.iraq,
        R.drawable.ireland,
        R.drawable.israel,
        R.drawable.italy,
        R.drawable.ivory_coast,
        R.drawable.jamaica,
        R.drawable.japan,
        R.drawable.jordan,
        R.drawable.kazakhstan,
        R.drawable.kenya,
        R.drawable.kiribati,
        R.drawable.kuwait,
        R.drawable.kyrgyzstan,
        R.drawable.laos,
        R.drawable.latvia,
        R.drawable.lebanon,
        R.drawable.lesotho,
        R.drawable.liberia,
        R.drawable.libya,
        R.drawable.liechtenstein,
        R.drawable.lithuania,
        R.drawable.luxembourg,
        R.drawable.madagascar,
        R.drawable.malawi,
        R.drawable.malaysia,
        R.drawable.maldives,
        R.drawable.mali,
        R.drawable.malta,
        R.drawable.marshall_islands,
        R.drawable.mauritania,
        R.drawable.mauritius,
        R.drawable.mexico,
        R.drawable.micronesia,
        R.drawable.moldova,
        R.drawable.monaco,
        R.drawable.mongolia,
        R.drawable.montenegro,
        R.drawable.morocco,
        R.drawable.mozambique,
        R.drawable.myanmar,
        R.drawable.namibia,
        R.drawable.nauru,
        R.drawable.nepal,
        R.drawable.netherlands,
        R.drawable.newzealand,
        R.drawable.nicaragua,
        R.drawable.niger,
        R.drawable.nigeria,
        R.drawable.north_macedonia,
        R.drawable.northkorea,
        R.drawable.norway,
        R.drawable.oman,
        R.drawable.pakistan,
        R.drawable.palau,
        R.drawable.panama,
        R.drawable.papua_new_guinea,
        R.drawable.paraguay,
        R.drawable.peru,
        R.drawable.phillipines,
        R.drawable.poland,
        R.drawable.portugal,
        R.drawable.qatar,
        R.drawable.romania,
        R.drawable.russia,
        R.drawable.rwanda,
        R.drawable.saint_kitts_and_nevis,
        R.drawable.saint_lucia,
        R.drawable.saint_vincent_and_the_grenadines,
        R.drawable.samoa,
        R.drawable.san_marino,
        R.drawable.sao_tome_and_principe,
        R.drawable.saudiarabia,
        R.drawable.senegal,
        R.drawable.serbia,
        R.drawable.seychelles,
        R.drawable.sierra_leone,
        R.drawable.singapore,
        R.drawable.slovakia,
        R.drawable.slovenia,
        R.drawable.solomon_islands,
        R.drawable.somalia,
        R.drawable.southafrica,
        R.drawable.southkorea,
        R.drawable.southsudan,
        R.drawable.spain,
        R.drawable.srilanka,
        R.drawable.sudan,
        R.drawable.suriname,
        R.drawable.sweden,
        R.drawable.switzerland,
        R.drawable.syria,
        R.drawable.tajikistan,
        R.drawable.thailand,
        R.drawable.the_gambia,
        R.drawable.togo,
        R.drawable.tonga,
        R.drawable.trinidad_and_tobago,
        R.drawable.tunisia,
        R.drawable.turkey,
        R.drawable.turkmenistan,
        R.drawable.tuvalu,
        R.drawable.uae,
        R.drawable.uganda,
        R.drawable.uk,
        R.drawable.ukraine,
        R.drawable.uruguay,
        R.drawable.usa,
        R.drawable.uzbekistan,
        R.drawable.vanuatu,
        R.drawable.venezuela,
        R.drawable.vietnam,
        R.drawable.yemen,
        R.drawable.zambia,
        R.drawable.zimbabwe
    };

    String[] answers = {
            "Afghanistan",
            "Albania",
            "Algeria",
            "Andorra",
            "Angola",
            "Antigua and Barbuda",
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            "Azerbaijan",
            "Bahamas",
            "Bahrain",
            "Bangladesh",
            "Barbados",
            "Belarus",
            "Belgium",
            "Belize",
            "Benin",
            "Bhutan",
            "Bolivia",
            "Bosnia and Herzegovina",
            "Botswana",
            "Brazil",
            "Brunei",
            "Bulgaria",
            "Burkina Faso",
            "Burundi",
            "Cambodia",
            "Cameroon",
            "Canada",
            "Cape Verde",
            "Central African Republic",
            "Chad",
            "Chile",
            "China",
            "Colombia",
            "Comoros",
            "Congo",
            "Costa Rica",
            "Croatia",
            "Cuba",
            "Cyprus",
            "Czech Republic",
            "Democratic Republic of the Congo",
            "Denmark",
            "Djibouti",
            "Dominica",
            "Dominican Republic",
            "East Timor",
            "Ecuador",
            "Egypt",
            "El Salvador",
            "Equatorial Guinea",
            "Eritrea",
            "Estonia",
            "Eswatini",
            "Ethiopia",
            "Fiji",
            "Finland",
            "France",
            "Gabon",
            "Georgia",
            "Germany",
            "Ghana",
            "Greece",
            "Grenada",
            "Guatemala",
            "Guinea",
            "Guinea Bissau",
            "Guyana",
            "Haiti",
            "Honduras",
            "Hungary",
            "Iceland",
            "India",
            "Indonesia",
            "Iran",
            "Iraq",
            "Ireland",
            "Israel",
            "Italy",
            "Ivory Coast",
            "Jamaica",
            "Japan",
            "Jordan",
            "Kazakhstan",
            "Kenya",
            "Kiribati",
            "Kuwait",
            "Kyrgyzstan",
            "Laos",
            "Latvia",
            "Lebanon",
            "Lesotho",
            "Liberia",
            "Libya",
            "Liechtenstein",
            "Lithuania",
            "Luxembourg",
            "Madagascar",
            "Malawi",
            "Malaysia",
            "Maldives",
            "Mali",
            "Malta",
            "Marshall Islands",
            "Mauritania",
            "Mauritius",
            "Mexico",
            "Micronesia",
            "Moldova",
            "Monaco",
            "Mongolia",
            "Montenegro",
            "Morocco",
            "Mozambique",
            "Myanmar",
            "Namibia",
            "Nauru",
            "Nepal",
            "Netherlands",
            "New Zealand",
            "Nicaragua",
            "Niger",
            "Nigeria",
            "North Macedonia",
            "North Korea",
            "Norway",
            "Oman",
            "Pakistan",
            "Palau",
            "Panama",
            "Papua New Guinea",
            "Paraguay",
            "Peru",
            "Phillipines",
            "Poland",
            "Portugal",
            "Qatar",
            "Romania",
            "Russia",
            "Rwanda",
            "Saint Kitts and Nevis",
            "Saint Lucia",
            "Saint Vincent and the Grenadines",
            "Samoa",
            "San Marino",
            "Sao Tome and Principe",
            "Saudi Arabia",
            "Senegal",
            "Serbia",
            "Seychelles",
            "Sierra Leone",
            "Singapore",
            "Slovakia",
            "Slovenia",
            "Solomon Islands",
            "Somalia",
            "South Africa",
            "South Korea",
            "South Sudan",
            "Spain",
            "Sri Lanka",
            "Sudan",
            "Suriname",
            "Sweden",
            "Switzerland",
            "Syria",
            "Tajikistan",
            "Thailand",
            "Gambia",
            "Togo",
            "Tonga",
            "Trinidad and Tobago",
            "Tunisia",
            "Turkey",
            "Turkmenistan",
            "Tuvalu",
            "United Arab Emirates",
            "Uganda",
            "United Kingdom",
            "Ukraine",
            "Uruguay",
            "United States of America",
            "Uzbekistan",
            "Vanuatu",
            "Venezuela",
            "Vietnam",
            "Yemen",
            "Zambia",
            "Zimbabwe"
    };

    int[] level ={2,2,2,3,3,3,1,
            2,1,1,3,3,2,1,
            2,2,1,3,3,3,3,
            3,3,1,2,2,3,3,
            1,2,1,3,3,2,1,
            1,1,3,3,2,2,1,
            2,2,3,1,3,3,3,
            2,2,1,3,3,3,3,
            3,3,2,1,1,3,2,
            1,3,1,3,3,3,3,
            3,3,3,2,2,1,1,
            2,1,1,1,1,2,2,
            1,3,3,3,3,3,3,
            2,3,1,3,3,3,3,
            3,3,3,3,1,3,3,
            3,3,3,3,1,2,3,
            2,2,2,2,3,3,3,
            3,2,1,1,3,3,2,
            2,1,1,3,1,3,2,
            2,2,2,1,1,1,2,
            2,1,3,3,3,3,2,
            3,3,1,3,2,3,3,
            1,2,2,3,2,1,1,
            3,1,2,3,3,1,1,
            2,3,2,3,3,3,3,
            2,1,2,2,2,3,1,
            1,1,1,3,3,2,1,
            3,3,3};
}
