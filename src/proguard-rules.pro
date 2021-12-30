# Add any ProGuard configurations specific to this
# extension here.

-keep public class io.viic.imc.Imc {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'io/viic/imc/repack'
-flattenpackagehierarchy
-dontpreverify
