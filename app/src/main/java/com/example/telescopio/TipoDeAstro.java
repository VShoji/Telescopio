package com.example.telescopio;

import androidx.annotation.NonNull;

import java.util.Objects;

public class TipoDeAstro implements Cloneable, Comparable<TipoDeAstro> {
    int id;
    String nome, desc;

    public TipoDeAstro(int id, String nome, String desc) {
        if (nome == null) throw new NullPointerException();
        if (desc == null) throw new NullPointerException();

        this.id = id;
        this.nome = nome;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setNome(String nome) {
        if (nome == null) throw new NullPointerException();
        if (nome.trim().length() == 0) throw new IllegalArgumentException();

        this.nome = nome;
    }

    public void setDesc(String desc) {
        if (desc == null) throw new NullPointerException();
        if (desc.trim().length() == 0) throw new IllegalArgumentException();

        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TipoDeAstro {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDeAstro that = (TipoDeAstro) o;
        return id == that.id && nome.equals(that.nome) && desc.equals(that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, desc);
    }

    public TipoDeAstro(TipoDeAstro other) {
        this.id = other.id;
        this.nome = other.nome;
        this.desc = other.desc;
    }

    @NonNull
    @Override
    public Object clone() {
        TipoDeAstro ret = null;

        try {
            ret = new TipoDeAstro(this);
        }
        catch (Exception ignored) { }

        return ret;
    }

    @Override
    public int compareTo(TipoDeAstro other) {
        if (this.id == other.id) return 0;
        if (this.id < other.id) return -1;
        return 1;
    }
}
