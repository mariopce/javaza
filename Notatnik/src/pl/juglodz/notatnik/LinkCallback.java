package pl.juglodz.notatnik;

import java.util.List;

import pl.juglodz.notatnik.data.LinkDTO;

public interface LinkCallback {

	public void zakonczona(List<LinkDTO> lista);
	
}
