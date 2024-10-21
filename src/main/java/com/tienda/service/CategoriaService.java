
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaService {
    
    //Metodo encargado de retornar una lista con las cateogrias
    //que estan en la tabla categorias, todas o solo las activas.
    public List<Categoria> getCategorias(boolean activos);
}
