package com.training.ecommerce.facade;

/**
 * Author mahc36
 * @param <DATA>
 * @param <MODEL>
 */
public interface Converter <DATA, MODEL>{

    /**
     *
     * @param model to convert to
     * @return DATA
     */
    DATA convert2Data(MODEL model);

    /**
     *
     * @param data to convert to
     * @return MODEL
     */
    MODEL convert2Model(DATA data);
}
