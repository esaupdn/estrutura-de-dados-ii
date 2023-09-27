
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String artistName;
    private int listeners, dailytrend, peak, pkListeners;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artist) {
        this.artistName = artistName;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public int getDailyTrend() {
        return dailytrend;
    }

    public void setDailyTrend(int dailytrend) {
        this.dailytrend = dailytrend;
    }

    public int getPeak() {
        return peak;
    }

    public void setPeak(int peak) {
        this.peak = peak;
    }

    public int getPkListeners() {
        return pkListeners;
    }

    public void setPkListeners(int pkListeners) {
        this.pkListeners = pkListeners;
    }
    
    


    
    @Override
    public int compareTo(Dados outroDado) {
        return this.getArtistName().
                compareTo(outroDado.getArtistName());
    }

    @Override
    public String toString() {
        return getArtistName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        
        if (o == null || getClass() != o.getClass()) 
            return false;
        
        Dados dados = (Dados) o;
        return artistName.equals(dados.artistName);}

    void DailyTrend(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}