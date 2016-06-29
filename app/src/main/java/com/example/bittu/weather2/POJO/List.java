package com.example.bittu.weather2.POJO;

/**
 * Created by BITTU on 5/31/2016.
 */public class List
{
    private String clouds;

    private String dt;

    private String humidity;

    private String pressure;

    private String speed;

    private String deg;

    private Weather[] weather;

    private Temp temp;

    private String rain;

    public String getClouds ()
    {
        return clouds;
    }

    public void setClouds (String clouds)
    {
        this.clouds = clouds;
    }

    public String getDt ()
    {
        return dt;
    }

    public void setDt (String dt)
    {
        this.dt = dt;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getPressure ()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
    }

    public Weather[] getWeather ()
    {
        return weather;
    }

    public void setWeather (Weather[] weather)
    {
        this.weather = weather;
    }

    public Temp getTemp ()
    {
        return temp;
    }

    public void setTemp (Temp temp)
    {
        this.temp = temp;
    }

    public String getRain ()
    {
        return rain;
    }

    public void setRain (String rain)
    {
        this.rain = rain;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [clouds = "+clouds+", dt = "+dt+", humidity = "+humidity+", pressure = "+pressure+", speed = "+speed+", deg = "+deg+", weather = "+weather+", temp = "+temp+", rain = "+rain+"]";
    }
}
