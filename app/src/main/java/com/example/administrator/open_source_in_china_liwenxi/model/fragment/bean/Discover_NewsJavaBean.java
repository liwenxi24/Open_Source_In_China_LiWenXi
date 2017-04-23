package com.example.administrator.open_source_in_china_liwenxi.model.fragment.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/16 0016.
 */

public class Discover_NewsJavaBean {

    private String pagesize;

    @Override
    public String toString() {
        return "Discover_NewsJavaBean{" +
                "pagesize='" + pagesize + '\'' +
                ", softwarecount='" + softwarecount + '\'' +
                ", softwares=" + softwares +
                '}';
    }

    private String softwarecount;
    private List<SoftwareBean> softwares;

    public String getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public String getSoftwarecount() {
        return softwarecount;
    }

    public void setSoftwarecount(String softwarecount) {
        this.softwarecount = softwarecount;
    }

    public List<SoftwareBean> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<SoftwareBean> softwares) {
        this.softwares = softwares;
    }

    public static class SoftwareBean {
        private String id;

        @Override
        public String toString() {
            return "SoftwareBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        private String name;
        private String description;
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}