
package com.vinu.moviedb.response.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "adult",
    "backdrop_path",
    "belongs_to_collection",
    "budget",
    "genres",
    "homepage",
    "id",
    "imdb_id",
    "original_language",
    "original_title",
    "overview",
    "popularity",
    "poster_path",
    "production_companies",
    "production_countries",
    "release_date",
    "revenue",
    "runtime",
    "spoken_languages",
    "status",
    "tagline",
    "title",
    "video",
    "vote_average",
    "vote_count"
})
public class MovieDetail {

    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;
    @JsonProperty("budget")
    private Integer budget;
    @JsonProperty("genres")
    private List<Genre> genres = new ArrayList<Genre>();
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies = new ArrayList<ProductionCompany>();
    @JsonProperty("production_countries")
    private List<ProductionCountry> productionCountries = new ArrayList<ProductionCountry>();
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("revenue")
    private Integer revenue;
    @JsonProperty("runtime")
    private Integer runtime;
    @JsonProperty("spoken_languages")
    private List<SpokenLanguage> spokenLanguages = new ArrayList<SpokenLanguage>();
    @JsonProperty("status")
    private String status;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adult")
    public Boolean getAdult() {
        return adult;
    }

    @JsonProperty("adult")
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public MovieDetail withAdult(Boolean adult) {
        this.adult = adult;
        return this;
    }

    @JsonProperty("backdrop_path")
    public String getBackdropPath() {
        return backdropPath;
    }

    @JsonProperty("backdrop_path")
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public MovieDetail withBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
        return this;
    }

    @JsonProperty("belongs_to_collection")
    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    @JsonProperty("belongs_to_collection")
    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public MovieDetail withBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
        return this;
    }

    @JsonProperty("budget")
    public Integer getBudget() {
        return budget;
    }

    @JsonProperty("budget")
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public MovieDetail withBudget(Integer budget) {
        this.budget = budget;
        return this;
    }

    @JsonProperty("genres")
    public List<Genre> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public MovieDetail withGenres(List<Genre> genres) {
        this.genres = genres;
        return this;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public MovieDetail withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public MovieDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("imdb_id")
    public String getImdbId() {
        return imdbId;
    }

    @JsonProperty("imdb_id")
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public MovieDetail withImdbId(String imdbId) {
        this.imdbId = imdbId;
        return this;
    }

    @JsonProperty("original_language")
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    @JsonProperty("original_language")
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public MovieDetail withOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
        return this;
    }

    @JsonProperty("original_title")
    public String getOriginalTitle() {
        return originalTitle;
    }

    @JsonProperty("original_title")
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public MovieDetail withOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
        return this;
    }

    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    public MovieDetail withOverview(String overview) {
        this.overview = overview;
        return this;
    }

    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public MovieDetail withPopularity(Double popularity) {
        this.popularity = popularity;
        return this;
    }

    @JsonProperty("poster_path")
    public String getPosterPath() {
        return posterPath;
    }

    @JsonProperty("poster_path")
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public MovieDetail withPosterPath(String posterPath) {
        this.posterPath = posterPath;
        return this;
    }

    @JsonProperty("production_companies")
    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    @JsonProperty("production_companies")
    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public MovieDetail withProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
        return this;
    }

    @JsonProperty("production_countries")
    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }

    @JsonProperty("production_countries")
    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public MovieDetail withProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
        return this;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MovieDetail withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @JsonProperty("revenue")
    public Integer getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public MovieDetail withRevenue(Integer revenue) {
        this.revenue = revenue;
        return this;
    }

    @JsonProperty("runtime")
    public Integer getRuntime() {
        return runtime;
    }

    @JsonProperty("runtime")
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public MovieDetail withRuntime(Integer runtime) {
        this.runtime = runtime;
        return this;
    }

    @JsonProperty("spoken_languages")
    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }

    @JsonProperty("spoken_languages")
    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public MovieDetail withSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public MovieDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public MovieDetail withTagline(String tagline) {
        this.tagline = tagline;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public MovieDetail withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    public MovieDetail withVideo(Boolean video) {
        this.video = video;
        return this;
    }

    @JsonProperty("vote_average")
    public Double getVoteAverage() {
        return voteAverage;
    }

    @JsonProperty("vote_average")
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public MovieDetail withVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
        return this;
    }

    @JsonProperty("vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    @JsonProperty("vote_count")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public MovieDetail withVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MovieDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(adult).append(backdropPath).append(belongsToCollection).append(budget).append(genres).append(homepage).append(id).append(imdbId).append(originalLanguage).append(originalTitle).append(overview).append(popularity).append(posterPath).append(productionCompanies).append(productionCountries).append(releaseDate).append(revenue).append(runtime).append(spokenLanguages).append(status).append(tagline).append(title).append(video).append(voteAverage).append(voteCount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieDetail) == false) {
            return false;
        }
        MovieDetail rhs = ((MovieDetail) other);
        return new EqualsBuilder().append(adult, rhs.adult).append(backdropPath, rhs.backdropPath).append(belongsToCollection, rhs.belongsToCollection).append(budget, rhs.budget).append(genres, rhs.genres).append(homepage, rhs.homepage).append(id, rhs.id).append(imdbId, rhs.imdbId).append(originalLanguage, rhs.originalLanguage).append(originalTitle, rhs.originalTitle).append(overview, rhs.overview).append(popularity, rhs.popularity).append(posterPath, rhs.posterPath).append(productionCompanies, rhs.productionCompanies).append(productionCountries, rhs.productionCountries).append(releaseDate, rhs.releaseDate).append(revenue, rhs.revenue).append(runtime, rhs.runtime).append(spokenLanguages, rhs.spokenLanguages).append(status, rhs.status).append(tagline, rhs.tagline).append(title, rhs.title).append(video, rhs.video).append(voteAverage, rhs.voteAverage).append(voteCount, rhs.voteCount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
