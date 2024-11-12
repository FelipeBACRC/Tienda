
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface CategoriaService {
    
    //Metodo encargado de retornar una lista con las cateogrias
    //que estan en la tabla categorias, todas o solo las activas.
    public List<Categoria> getCategorias(boolean activos);
    
       // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}






