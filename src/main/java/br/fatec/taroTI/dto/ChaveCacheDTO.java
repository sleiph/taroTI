package br.fatec.taroTI.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class ChaveCacheDTO {

    private final String session;

    private final LocalDateTime dia;

    private boolean isMaior;

    public ChaveCacheDTO(String session, LocalDateTime dia, boolean isMaior) {
        this.session = session;
        this.dia = dia;
        this.isMaior = isMaior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChaveCacheDTO that = (ChaveCacheDTO) o;
        return Objects.equals(session, that.session) && Objects.equals(dia, that.dia) && isMaior == isMaior;
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, dia, isMaior);
    }

}
