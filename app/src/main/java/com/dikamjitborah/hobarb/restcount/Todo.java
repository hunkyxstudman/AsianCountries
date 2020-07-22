package com.dikamjitborah.hobarb.restcount;

import java.util.List;

import androidx.annotation.NonNull;

public class Todo {
    /**
     * name : Åland Islands
     * topLevelDomain : [".ax"]
     * alpha2Code : AX
     * alpha3Code : ALA
     * callingCodes : ["358"]
     * capital : Mariehamn
     * altSpellings : ["AX","Aaland","Aland","Ahvenanmaa"]
     * region : Europe
     * subregion : Northern Europe
     * population : 28875
     * latlng : [60.116667,19.9]
     * demonym : Ålandish
     * area : 1580.0
     * gini : null
     * timezones : ["UTC+02:00"]
     * borders : []
     * nativeName : Åland
     * numericCode : 248
     * currencies : [{"code":"EUR","name":"Euro","symbol":"\u20ac"}]
     * languages : [{"iso639_1":"sv","iso639_2":"swe","name":"Swedish","nativeName":"svenska"}]
     * translations : {"de":"Åland","es":"Alandia","fr":"Åland","ja":"オーランド諸島","it":"Isole Aland","br":"Ilhas de Aland","pt":"Ilhas de Aland","nl":"Ålandeilanden","hr":"Ålandski otoci","fa":"جزایر الند"}
     * flag : https://restcountries.eu/data/ala.svg
     * regionalBlocs : [{"acronym":"EU","name":"European Union","otherAcronyms":[],"otherNames":[]}]
     * cioc :
     */

    private String name;
    private String alpha2Code;
    private String alpha3Code;
    private String capital;
    private String region;
    private String subregion;
    private int population;
    private String demonym;
    private double area;
    private Object gini;
    private String nativeName;
    private String numericCode;
    private TranslationsBean translations;
    private String flag;
    private String cioc;
    private List<String> topLevelDomain;
    private List<String> callingCodes;
    private List<String> altSpellings;
    private List<Double> latlng;
    private List<String> timezones;
    private List<?> borders;
    private List<CurrenciesBean> currencies;
    private List<LanguagesBean> languages;
    private List<RegionalBlocsBean> regionalBlocs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Object getGini() {
        return gini;
    }

    public void setGini(Object gini) {
        this.gini = gini;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public TranslationsBean getTranslations() {
        return translations;
    }

    public void setTranslations(TranslationsBean translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<?> getBorders() {
        return borders;
    }

    public void setBorders(List<?> borders) {
        this.borders = borders;
    }

    public List<CurrenciesBean> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrenciesBean> currencies) {
        this.currencies = currencies;
    }

    public List<LanguagesBean> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesBean> languages) {
        this.languages = languages;
    }

    public List<RegionalBlocsBean> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBlocsBean> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public static class TranslationsBean {
        /**
         * de : Åland
         * es : Alandia
         * fr : Åland
         * ja : オーランド諸島
         * it : Isole Aland
         * br : Ilhas de Aland
         * pt : Ilhas de Aland
         * nl : Ålandeilanden
         * hr : Ålandski otoci
         * fa : جزایر الند
         */

        private String de;
        private String es;
        private String fr;
        private String ja;
        private String it;
        private String br;
        private String pt;
        private String nl;
        private String hr;
        private String fa;

        public String getDe() {
            return de;
        }

        public void setDe(String de) {
            this.de = de;
        }

        public String getEs() {
            return es;
        }

        public void setEs(String es) {
            this.es = es;
        }

        public String getFr() {
            return fr;
        }

        public void setFr(String fr) {
            this.fr = fr;
        }

        public String getJa() {
            return ja;
        }

        public void setJa(String ja) {
            this.ja = ja;
        }

        public String getIt() {
            return it;
        }

        public void setIt(String it) {
            this.it = it;
        }

        public String getBr() {
            return br;
        }

        public void setBr(String br) {
            this.br = br;
        }

        public String getPt() {
            return pt;
        }

        public void setPt(String pt) {
            this.pt = pt;
        }

        public String getNl() {
            return nl;
        }

        public void setNl(String nl) {
            this.nl = nl;
        }

        public String getHr() {
            return hr;
        }

        public void setHr(String hr) {
            this.hr = hr;
        }

        public String getFa() {
            return fa;
        }

        public void setFa(String fa) {
            this.fa = fa;
        }
    }

    public static class CurrenciesBean {
        /**
         * code : EUR
         * name : Euro
         * symbol : €
         */

        private String code;
        private String name;
        private String symbol;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public static class LanguagesBean {
        /**
         * iso639_1 : sv
         * iso639_2 : swe
         * name : Swedish
         * nativeName : svenska
         */

        private String iso639_1;
        private String iso639_2;
        private String name;
        private String nativeName;

        public String getIso639_1() {
            return iso639_1;
        }

        public void setIso639_1(String iso639_1) {
            this.iso639_1 = iso639_1;
        }

        public String getIso639_2() {
            return iso639_2;
        }

        public void setIso639_2(String iso639_2) {
            this.iso639_2 = iso639_2;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNativeName() {
            return nativeName;
        }

        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }
    }

    public static class RegionalBlocsBean {
        /**
         * acronym : EU
         * name : European Union
         * otherAcronyms : []
         * otherNames : []
         */

        private String acronym;
        private String name;
        private List<?> otherAcronyms;
        private List<?> otherNames;

        public String getAcronym() {
            return acronym;
        }

        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<?> getOtherAcronyms() {
            return otherAcronyms;
        }

        public void setOtherAcronyms(List<?> otherAcronyms) {
            this.otherAcronyms = otherAcronyms;
        }

        public List<?> getOtherNames() {
            return otherNames;
        }

        public void setOtherNames(List<?> otherNames) {
            this.otherNames = otherNames;
        }

        @NonNull
        @Override
        public String toString() {
            return name + " ";
        }
    }
}
