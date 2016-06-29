package com.example.bittu.weather2.POJO;

import java.util.List;

/**
 * Created by BITTU on 5/31/2016.
 */
public class Model
{
    private String message;

    private String cnt;

    private String cod;

    private List[] list;

    private City city;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getCnt ()
    {
        return cnt;
    }

    public void setCnt (String cnt)
    {
        this.cnt = cnt;
    }

    public String getCod ()
    {
        return cod;
    }

    public void setCod (String cod)
    {
        this.cod = cod;
    }

    public List[] getList ()
    {
        return list;
    }

    public void setList (List[] list)
    {
        this.list = list;
    }

    public City getCity ()
    {
        return city;
    }

    public void setCity (City city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", cnt = "+cnt+", cod = "+cod+", list = "+list+", city = "+city+"]";
    }
}
