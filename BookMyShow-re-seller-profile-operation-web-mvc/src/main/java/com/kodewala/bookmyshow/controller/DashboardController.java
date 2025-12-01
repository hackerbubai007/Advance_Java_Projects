package com.kodewala.bookmyshow.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.bookmyshow.controller.bean.Movie;

@Controller

public class DashboardController {

	private List<Movie> movies = new ArrayList<>();
	private AtomicLong idCounter = new AtomicLong(1);

	// Home Menu
	@GetMapping("/showMenu")
	public String showMenu(Model model) {
		model.addAttribute("totalMovies", movies.size());
		return "showMenu";
	}

	// Show form to add movie
	@GetMapping("/addMovie")
	public String showAddMovieForm(Model model) {
		model.addAttribute("movie", new Movie());
		return "addNewMovie";
	}

	// Save movie
	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute Movie movie, Model model) {

		movies.add(movie);
		model.addAttribute("movies", movies);
		model.addAttribute("message", "Movie Added Successfully!");
		return "viewMovies";
	}

	// View Movies Page
	@GetMapping("/viewMovies")
	public String viewMovies(Model model) {
		model.addAttribute("movies", movies);
		if (movies.isEmpty()) {
			model.addAttribute("message", "No movies available. Please add some movies.");
		}
		return "viewMovies";
	}

	// Delete Movie by index
	@GetMapping("/deleteMovie/{index}")
	public String deleteMovie(@PathVariable("index") int index, Model model) {
		if (index >= 0 && index < movies.size()) {
			Movie deletedMovie = movies.remove(index);
			model.addAttribute("message", "Movie '" + deletedMovie.getMovieName() + "' Deleted Successfully!");
		} else {
			model.addAttribute("error", "Invalid movie index!");
		}
		model.addAttribute("movies", movies);
		return "viewMovies";
	}

	// Show Update Form
	@GetMapping("/updateMovie/{index}")
	public String showUpdateForm(@PathVariable("index") int index, Model model) {
		if (index >= 0 && index < movies.size()) {
			model.addAttribute("movie", movies.get(index));
			model.addAttribute("index", index);
			return "updateMovie";
		} else {
			model.addAttribute("error", "Invalid movie index!");
			model.addAttribute("movies", movies);
			return "viewMovies";
		}
	}

	// Save Updated Movie

	@PostMapping("/updateMovie/saveUpdate/{index}")
	public String saveUpdatedMovie(@PathVariable("index") int index, @ModelAttribute Movie updatedMovie, Model model) {
		if (index >= 0 && index < movies.size()) {
			movies.set(index, updatedMovie);
			model.addAttribute("message", "Movie Updated Successfully!");
			model.addAttribute("movies", movies);
			return "viewMovies";
		} else {
			model.addAttribute("error", "Invalid movie index!");
			model.addAttribute("movies", movies);
			return "viewMovies";
		}

	}
}