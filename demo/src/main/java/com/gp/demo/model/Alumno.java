package com.gp.demo.model;

public class Alumno extends Persona {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4131036736895284104L;
	private String numeroMatricula;
    private String email;

    public Alumno() {
        // TODO Auto-generated constructor stub
    }

    public Alumno(int numeroCedula, String email) {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}