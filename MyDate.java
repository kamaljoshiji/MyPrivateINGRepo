/*------------------------------------------------------------------------------
 *     Ident: Java Education Center
 *    Author: wingerma, neerpati
 * Copyright: (c) 1-apr-1014 Sogeti Nederland B.V. All Rights Reserved.
 *------------------------------------------------------------------------------
 * Sogeti Nederland B.V.    |  No part of this file may be reproduced or
 * Divisie Managed Delivery |  transmitted in any form or by any means,
 * Lange Dreef 17           |  electronic or mechanical, for the purpose,
 * 4131 NJ VIANEN           |  without the express written permission of the
 * The Netherlands          |  copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.aegon.assessment.cases.helpers;

import java.util.Date;

public class MyDate extends Date
{
   private static final long serialVersionUID = 1156110353454871454L;

   /*
    * This is not where you should fix any problems, you should not depend on the clone method but explicitly create a new object.
    * @see java.util.Date#clone()
    */
   @Override
   public Object clone()
   {
      return this;
   }
}
