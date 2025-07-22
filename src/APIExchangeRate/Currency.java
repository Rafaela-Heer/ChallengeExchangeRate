package APIExchangeRate;

public class Currency {
    private String result;
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;


    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public static String getRates() {
        String rates = "\nUse the currency code:\n" +
                "AED\tUAE Dirham\n" +
                "AFN\tAfghan Afghani\n" +
                "ALL\tAlbanian Lek\n" +
                "AMD\tArmenian Dram\n" +
                "ANG\tNetherlands Antillian Guilder\n" +
                "AOA\tAngolan Kwanza\n" +
                "ARS\tArgentine Peso\n" +
                "AUD\tAustralian Dollar\n" +
                "AWG\tAruban Florin\n" +
                "AZN\tAzerbaijani Manat\n" +
                "BAM\tBosnia and Herzegovina Mark\n" +
                "BBD\tBarbados Dollar\n" +
                "BDT\tBangladeshi Taka\n" +
                "BGN\tBulgarian Lev\n" +
                "BHD\tBahraini Dinar\n" +
                "BIF\tBurundian Franc\n" +
                "BMD\tBermudian Dollar\n" +
                "BND\tBrunei Dollar\n" +
                "BOB\tBolivian Boliviano\n" +
                "BRL\tBrazilian Real\n" +
                "BSD\tBahamian Dollar\n" +
                "BTN\tBhutanese Ngultrum\n" +
                "BWP\tBotswana Pula\n" +
                "BYN\tBelarusian Ruble\n" +
                "BZD\tBelize Dollar\n" +
                "CAD\tCanadian Dollar\n" +
                "CDF\tCongolese Franc\n" +
                "CHF\tSwiss Franc\n" +
                "CLP\tChilean Peso\n" +
                "CNY\tChinese Renminbi\n" +
                "COP\tColombian Peso\n" +
                "CRC\tCosta Rican Colon\n" +
                "CUP\tCuban Peso\n" +
                "CVE\tCape Verdean Escudo\n" +
                "CZK\tCzech Koruna\n" +
                "DJF\tDjiboutian Franc\n" +
                "DKK\tDanish Krone\n" +
                "DOP\tDominican Peso\n" +
                "DZD\tAlgerian Dinar\n" +
                "EGP\tEgyptian Pound\n" +
                "ERN\tEritrean Nakfa\n" +
                "ETB\tEthiopian Birr\n" +
                "EUR\tEuro\n" +
                "FJD\tFiji Dollar\n" +
                "FKP\tFalkland Islands Pound\n" +
                "FOK\tFaroese Króna\n" +
                "GBP\tPound Sterling\n" +
                "GEL\tGeorgian Lari\n" +
                "GGP\tGuernsey Pound\n" +
                "GHS\tGhanaian Cedi\n" +
                "GIP\tGibraltar Pound\n" +
                "GMD\tGambian Dalasi\n" +
                "GNF\tGuinean Franc\n" +
                "GTQ\tGuatemalan Quetzal\n" +
                "GYD\tGuyanese Dollar\n" +
                "HKD\tHong Kong Dollar\n" +
                "HNL\tHonduran Lempira\n" +
                "HRK\tCroatian Kuna\n" +
                "HTG\tHaitian Gourde\n" +
                "HUF\tHungarian Forint\n" +
                "IDR\tIndonesian Rupiah\n" +
                "ILS\tIsraeli New Shekel\n" +
                "IMP\tManx Pound\n" +
                "INR\tIndian Rupee\n" +
                "IQD\tIraqi Dinar\n" +
                "IRR\tIranian Rial\n" +
                "ISK\tIcelandic Króna\n" +
                "JEP\tJersey Pound\n" +
                "JMD\tJamaican Dollar\n" +
                "JOD\tJordanian Dinar\n" +
                "JPY\tJapanese Yen\n" +
                "KES\tKenyan Shilling\n" +
                "KGS\tKyrgyzstani Som\n" +
                "KHR\tCambodian Riel\n" +
                "KID\tKiribati Dollar\n" +
                "KMF\tComorian Franc\n" +
                "KRW\tSouth Korean Won\n" +
                "KWD\tKuwaiti Dinar\n" +
                "KYD\tCayman Islands Dollar\n" +
                "KZT\tKazakhstani Tenge\n" +
                "LAK\tLao Kip\n" +
                "LBP\tLebanese Pound\n" +
                "LKR\tSri Lanka Rupee\n" +
                "LRD\tLiberian Dollar\n" +
                "LSL\tLesotho Loti\n" +
                "LYD\tLibyan Dinar\n" +
                "MAD\tMoroccan Dirham\n" +
                "MDL\tMoldovan Leu\n" +
                "MGA\tMalagasy Ariary\n" +
                "MKD\tMacedonian Denar\n" +
                "MMK\tBurmese Kyat\n" +
                "MNT\tMongolian Tögrög\n" +
                "MOP\tMacanese Pataca\n" +
                "MRU\tMauritanian Ouguiya\n" +
                "MUR\tMauritian Rupee\n" +
                "MVR\tMaldivian Rufiyaa\n" +
                "MWK\tMalawian Kwacha\n" +
                "MXN\tMexican Peso\n" +
                "MYR\tMalaysian Ringgit\n" +
                "MZN\tMozambican Metical\n" +
                "NAD\tNamibian Dollar\n" +
                "NGN\tNigerian Naira\n" +
                "NIO\tNicaraguan Córdoba\n" +
                "NOK\tNorwegian Krone\n" +
                "NPR\tNepalese Rupee\n" +
                "NZD\tNew Zealand Dollar\n" +
                "OMR\tOmani Rial\n" +
                "PAB\tPanamanian Balboa\n" +
                "PEN\tPeruvian Sol\n" +
                "PGK\tPapua New Guinean Kina\n" +
                "PHP\tPhilippine Peso\n" +
                "PKR\tPakistani Rupee\n" +
                "PLN\tPolish Złoty\n" +
                "PYG\tParaguayan Guaraní\n" +
                "QAR\tQatari Riyal\n" +
                "RON\tRomanian Leu\n" +
                "RSD\tSerbian Dinar\n" +
                "RUB\tRussian Ruble\n" +
                "RWF\tRwandan Franc\n" +
                "SAR\tSaudi Riyal\n" +
                "SBD\tSolomon Islands Dollar\n" +
                "SCR\tSeychellois Rupee\n" +
                "SDG\tSudanese Pound\n" +
                "SEK\tSwedish Krona\n" +
                "SGD\tSingapore Dollar\n" +
                "SHP\tSaint Helena Pound\n" +
                "SLE\tSierra Leonean Leone\n" +
                "SOS\tSomali Shilling\n" +
                "SRD\tSurinamese Dollar\n" +
                "SSP\tSouth Sudanese Pound\n" +
                "STN\tSão Tomé and Príncipe Dobra\n" +
                "SYP\tSyrian Pound\n" +
                "SZL\tEswatini Lilangeni\n" +
                "THB\tThai Baht\n" +
                "TJS\tTajikistani Somoni\n" +
                "TMT\tTurkmenistan Manat\n" +
                "TND\tTunisian Dinar\n" +
                "TOP\tTongan Paʻanga\n" +
                "TRY\tTurkish Lira\n" +
                "TTD\tTrinidad and Tobago Dollar\n" +
                "TVD\tTuvaluan Dollar\n" +
                "TWD\tNew Taiwan Dollar\n" +
                "TZS\tTanzanian Shilling\n" +
                "UAH\tUkrainian Hryvnia\n" +
                "UGX\tUgandan Shilling\n" +
                "USD\tUnited States Dollar\n" +
                "UYU\tUruguayan Peso\n" +
                "UZS\tUzbekistani So'm\n" +
                "VES\tVenezuelan Bolívar Soberano\n" +
                "VND\tVietnamese Đồng\n" +
                "VUV\tVanuatu Vatu\n" +
                "WST\tSamoan Tālā\n" +
                "XAF\tCentral African CFA Franc\n" +
                "XCD\tEast Caribbean Dollar\n" +
                "XDR\tSpecial Drawing Rights\n" +
                "XOF\tWest African CFA franc\n" +
                "XPF\tCFP Franc\n" +
                "YER\tYemeni Rial\n" +
                "ZAR\tSouth African Rand\n" +
                "ZMW\tZambian Kwacha\n" +
                "ZWL\tZimbabwean Dollar";
        return rates;
    }
}