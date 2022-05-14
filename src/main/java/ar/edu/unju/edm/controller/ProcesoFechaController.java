package ar.edu.unju.edm.controller;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.ProcesoFecha;

@Controller

public class ProcesoFechaController {
	@Autowired

	// EJERCICIO A

	ProcesoFecha procesoFecha;

	@GetMapping("/calcularTiempoTranscurrido")

	public ModelAndView getTiempoTranscurrido(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		Period tiempoTranscurrido = procesoFecha.contarTiempoTranscurrido();

		ModelAndView modelView = new ModelAndView("calcularTiempoTranscurrido");
		modelView.addObject("resultadoTiempoTranscurridoYears", tiempoTranscurrido.getYears());
		modelView.addObject("resultadoTiempoTranscurridoMonths", tiempoTranscurrido.getMonths());
		modelView.addObject("resultadoTiempoTranscurridoDays", tiempoTranscurrido.getDays());

		return modelView;
	}

	@GetMapping("/formatearFechaPage")

	public ModelAndView getFormatearPage(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		ModelAndView modelView = new ModelAndView("/formatearFechaPage");

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		modelView.addObject("resultadoFechaFormateada1", procesoFecha.formatearFecha(procesoFecha.getFecha1()));
		modelView.addObject("resultadoFechaFormateada2", procesoFecha.formatearFecha(procesoFecha.getFecha2()));

		return modelView;
	}

	// b_3
	@GetMapping("/compararFechasPage")

	public ModelAndView getCompararPage(@RequestParam(name = "fecha1") String fecha1,
			@RequestParam(name = "fecha2") String fecha2) {

		ModelAndView modelView = new ModelAndView("/compararFechasPage");

		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));

		String formateo1 = procesoFecha.formatearFecha(procesoFecha.getFecha1());
		String formateo2 = procesoFecha.formatearFecha(procesoFecha.getFecha2());

		procesoFecha.setFecha1(LocalDate.parse(formateo1, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		procesoFecha.setFecha2(LocalDate.parse(formateo2, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		String resultadoComparacion = procesoFecha.compararFechas();

		modelView.addObject("resultadoCompararFechas", resultadoComparacion);

		return modelView;
	}

	// EJERCICIO B

	// b_1
	@GetMapping("/procesoFechaB1")
	public ModelAndView getProcesoFecha() {
		ModelAndView modelView = new ModelAndView("/procesoFechaB1");

		// cree un objeto pf1 de la clase ProcesoFecha sobrecargado con los parametros
		// para las variables de tipo LocalDate
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(2000, 4, 15), LocalDate.now());

		// mostrar el valor de cada variable
		modelView.addObject("variable1", pf1.getFecha1());
		modelView.addObject("variable2", pf1.getFecha2());

		return modelView;
	}

	// b_2
	@GetMapping("/procesoFechaB2")
	public ModelAndView getProcesoFecha2() {
		ModelAndView modelView = new ModelAndView("/procesoFechaB2");

		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(5, 30, 2), LocalTime.of(20, 40, 10));

		modelView.addObject("variable1", pf2.getTime1().plusHours(5));
		modelView.addObject("variable2", pf2.getTime2().minusMinutes(20));

		return modelView;
	}

	// b_3
	// @GetMapping("/procesoFechaB3")
	// public ModelAndView getProcesoFecha3() {
	// ModelAndView modelView= new ModelAndView("/procesoFechaB3");

	// return modelView;
	// }

	// b_4
	@GetMapping("/procesoFechaB4")
	public ModelAndView getProcesoFecha4() {
		ModelAndView modelView = new ModelAndView("/procesoFechaB4");

		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(2003, 7, 26, 12, 53, 10),
				LocalDateTime.of(2022, 5, 14, 17, 13, 36));

		modelView.addObject("variable1", pf3.getDateTime1());
		modelView.addObject("variable2", pf3.getDateTime2());

		return modelView;
	}

	// b_5
	@GetMapping("/procesoFechaB5")
	public ModelAndView getProcesoFecha5() {
		ModelAndView modelView = new ModelAndView("/procesoFechaB5");

		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(2003, 7, 26), LocalDate.now());

		Period tiempoTranscurrido = pf4.contarTiempoTranscurrido();

		modelView.addObject("variable1", tiempoTranscurrido.getYears());
		modelView.addObject("variable2", tiempoTranscurrido.getMonths());
		modelView.addObject("variable3", tiempoTranscurrido.getDays());

		return modelView;
	}

	// b_6 y b_7
	@GetMapping("/procesoFechaB6")
	public ModelAndView getProcesoFecha6(@RequestParam(name = "fecha1") String fecha1, @RequestParam(name = "fecha2") String fecha2) throws Exception {
		ModelAndView modelView = new ModelAndView("/procesoFechaB6");

		ProcesoFecha pf5 = new ProcesoFecha();
		try {
			pf5.setFecha1(LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			pf5.setFecha2(LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
			LocalDate incremento = pf5.getFecha1().plusDays(365);
			LocalDate decremento = pf5.getFecha2().minusMonths(6);

			modelView.addObject("variable1", incremento);
			modelView.addObject("variable2", decremento);

			return modelView;
			
		} catch (Exception e) {
			throw new Exception("¡¡¡ DEBE INGRESAR UNA FECHA VALIDA !!!");
		}

		
	}

}
