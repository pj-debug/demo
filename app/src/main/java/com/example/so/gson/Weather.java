package com.example.so.gson;

import java.util.List;

public class Weather {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101010100","location":"北京","parent_city":"北京","admin_area":"北京","cnty":"中国","lat":"39.90498734","lon":"116.4052887","tz":"+8.00"}
         * update : {"loc":"2020-03-26 14:45","utc":"2020-03-26 06:45"}
         * status : ok
         * now : {"cloud":"91","cond_code":"104","cond_txt":"阴","fl":"6","hum":"15","pcpn":"0.0","pres":"1019","tmp":"11","vis":"16","wind_deg":"9","wind_dir":"北风","wind_sc":"3","wind_spd":"19"}
         * daily_forecast : [{"cond_code_d":"305","cond_code_n":"101","cond_txt_d":"小雨","cond_txt_n":"多云","date":"2020-03-26","hum":"65","mr":"07:16","ms":"20:15","pcpn":"0.0","pop":"25","pres":"500","sr":"06:05","ss":"18:34","tmp_max":"12","tmp_min":"2","uv_index":"1","vis":"2","wind_deg":"0","wind_dir":"北风","wind_sc":"4-5","wind_spd":"30"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2020-03-27","hum":"65","mr":"07:41","ms":"21:13","pcpn":"3.3","pop":"69","pres":"500","sr":"06:04","ss":"18:35","tmp_max":"13","tmp_min":"1","uv_index":"11","vis":"2","wind_deg":"339","wind_dir":"西北风","wind_sc":"3-4","wind_spd":"12"},{"cond_code_d":"100","cond_code_n":"101","cond_txt_d":"晴","cond_txt_n":"多云","date":"2020-03-28","hum":"65","mr":"08:08","ms":"22:13","pcpn":"0.0","pop":"0","pres":"500","sr":"06:02","ss":"18:36","tmp_max":"14","tmp_min":"3","uv_index":"10","vis":"2","wind_deg":"248","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"14"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2020-03-29","hum":"65","mr":"08:38","ms":"23:13","pcpn":"0.0","pop":"0","pres":"500","sr":"06:00","ss":"18:37","tmp_max":"18","tmp_min":"6","uv_index":"3","vis":"2","wind_deg":"238","wind_dir":"西南风","wind_sc":"1-2","wind_spd":"9"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2020-03-30","hum":"65","mr":"09:13","ms":"00:00","pcpn":"0.0","pop":"0","pres":"500","sr":"05:59","ss":"18:38","tmp_max":"20","tmp_min":"9","uv_index":"6","vis":"2","wind_deg":"182","wind_dir":"南风","wind_sc":"1-2","wind_spd":"1"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2020-03-31","hum":"65","mr":"09:55","ms":"00:13","pcpn":"0.0","pop":"4","pres":"500","sr":"05:57","ss":"18:39","tmp_max":"20","tmp_min":"7","uv_index":"3","vis":"2","wind_deg":"0","wind_dir":"北风","wind_sc":"4-5","wind_spd":"27"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2020-04-01","hum":"65","mr":"10:44","ms":"01:13","pcpn":"0.0","pop":"0","pres":"500","sr":"05:56","ss":"18:40","tmp_max":"15","tmp_min":"4","uv_index":"6","vis":"2","wind_deg":"8","wind_dir":"北风","wind_sc":"3-4","wind_spd":"22"}]
         * hourly : [{"cloud":"94","cond_code":"104","cond_txt":"阴","dew":"-16","hum":"36","pop":"0","pres":"500","time":"2020-03-26 16:00","tmp":"11","wind_deg":"354","wind_dir":"北风","wind_sc":"4-5","wind_spd":"29"},{"cloud":"98","cond_code":"101","cond_txt":"多云","dew":"-16","hum":"31","pop":"0","pres":"500","time":"2020-03-26 19:00","tmp":"9","wind_deg":"183","wind_dir":"南风","wind_sc":"4-5","wind_spd":"30"},{"cloud":"45","cond_code":"101","cond_txt":"多云","dew":"-19","hum":"28","pop":"0","pres":"500","time":"2020-03-26 22:00","tmp":"6","wind_deg":"176","wind_dir":"南风","wind_sc":"3-4","wind_spd":"21"},{"cloud":"11","cond_code":"100","cond_txt":"晴","dew":"-21","hum":"29","pop":"0","pres":"500","time":"2020-03-27 01:00","tmp":"4","wind_deg":"177","wind_dir":"南风","wind_sc":"3-4","wind_spd":"12"},{"cloud":"47","cond_code":"100","cond_txt":"晴","dew":"-19","hum":"32","pop":"0","pres":"500","time":"2020-03-27 04:00","tmp":"2","wind_deg":"184","wind_dir":"南风","wind_sc":"1-2","wind_spd":"1"},{"cloud":"27","cond_code":"100","cond_txt":"晴","dew":"-18","hum":"30","pop":"0","pres":"500","time":"2020-03-27 07:00","tmp":"2","wind_deg":"184","wind_dir":"南风","wind_sc":"1-2","wind_spd":"4"},{"cloud":"4","cond_code":"100","cond_txt":"晴","dew":"-20","hum":"18","pop":"0","pres":"500","time":"2020-03-27 10:00","tmp":"7","wind_deg":"278","wind_dir":"西风","wind_sc":"1-2","wind_spd":"8"},{"cloud":"1","cond_code":"100","cond_txt":"晴","dew":"-22","hum":"14","pop":"0","pres":"500","time":"2020-03-27 13:00","tmp":"12","wind_deg":"285","wind_dir":"西北风","wind_sc":"3-4","wind_spd":"17"}]
         * lifestyle : [{"type":"comf","brf":"很不舒适","txt":"白天天气凉、风力较强，并会伴有雨雪天气，在这种天气条件下，您会感觉很冷，不舒适，注意保暖。"},{"type":"drsg","brf":"冷","txt":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"},{"type":"flu","brf":"极易发","txt":"将有一次降温过程，且风力较强，极易发生感冒，请特别注意增加衣服保暖防寒。"},{"type":"sport","brf":"较不宜","txt":"有降水，且风力较强，推荐您在室内进行各种健身休闲运动；若坚持户外运动，请注意防风保暖。"},{"type":"trav","brf":"适宜","txt":"有降水，虽然风稍大，但温度适宜，适宜旅游，可不要错过机会呦！"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;
        private List<LifestyleBean> lifestyle;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public List<LifestyleBean> getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
        }

        public static class BasicBean {
            /**
             * cid : CN101010100
             * location : 北京
             * parent_city : 北京
             * admin_area : 北京
             * cnty : 中国
             * lat : 39.90498734
             * lon : 116.4052887
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2020-03-26 14:45
             * utc : 2020-03-26 06:45
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 91
             * cond_code : 104
             * cond_txt : 阴
             * fl : 6
             * hum : 15
             * pcpn : 0.0
             * pres : 1019
             * tmp : 11
             * vis : 16
             * wind_deg : 9
             * wind_dir : 北风
             * wind_sc : 3
             * wind_spd : 19
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 305
             * cond_code_n : 101
             * cond_txt_d : 小雨
             * cond_txt_n : 多云
             * date : 2020-03-26
             * hum : 65
             * mr : 07:16
             * ms : 20:15
             * pcpn : 0.0
             * pop : 25
             * pres : 500
             * sr : 06:05
             * ss : 18:34
             * tmp_max : 12
             * tmp_min : 2
             * uv_index : 1
             * vis : 2
             * wind_deg : 0
             * wind_dir : 北风
             * wind_sc : 4-5
             * wind_spd : 30
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d() {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n() {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d() {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n() {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max() {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min() {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 94
             * cond_code : 104
             * cond_txt : 阴
             * dew : -16
             * hum : 36
             * pop : 0
             * pres : 500
             * time : 2020-03-26 16:00
             * tmp : 11
             * wind_deg : 354
             * wind_dir : 北风
             * wind_sc : 4-5
             * wind_spd : 29
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew() {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 很不舒适
             * txt : 白天天气凉、风力较强，并会伴有雨雪天气，在这种天气条件下，您会感觉很冷，不舒适，注意保暖。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
