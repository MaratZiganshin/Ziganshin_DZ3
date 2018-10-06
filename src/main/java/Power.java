/**
 * Copyright (c) 2009 ISP RAS.
 * 109004, A. Solzhenitsina, 25, Moscow, Russia.
 * All rights reserved.
 *
 * $Id$
 * Created on Jan 15, 2016
 */


/**
 * @author Victor Kuliamin
 */
public class Power {

    public int pow(int a, int b) {
        int r = 1;

        while(b > 0) {
            if((b&1) != 0) r *= a;
            a *= a;
            b >>= 1;
        }

        return r;
    }
}
