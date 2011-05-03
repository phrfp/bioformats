/*
 * Copyright (c) 1998 by Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Sun Microsystems, Inc. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Sun.
 */

package com.sun.jimi.core.raster;

import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;

/**
 * Channeled version of IntRasterImage.
 * @author  Luke Gorrie
 * @version $Revision: 1.1.1.1 $ $Date: 1998/12/01 12:21:57 $
 */
public class MemoryChanneledIntRasterImage extends MemoryIntRasterImage
{
	public MemoryChanneledIntRasterImage(int w, int h, ColorModel cm)
	{
		super(w, h, cm);
	}

	public void addDirectConsumer(ImageConsumer consumer)
	{
		addWaitingConsumer(consumer);
	}

}

