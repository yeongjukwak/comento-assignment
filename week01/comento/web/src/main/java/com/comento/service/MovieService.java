package com.comento.service;

import java.util.List;

import com.comento.vo.MovieVO;

public interface MovieService {
	public List<MovieVO> selectMovie() throws Exception;
}
