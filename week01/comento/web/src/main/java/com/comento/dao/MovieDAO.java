package com.comento.dao;

import java.util.List;

import com.comento.vo.MovieVO;

public interface MovieDAO {
	public List<MovieVO> selectMovie() throws Exception;
}
