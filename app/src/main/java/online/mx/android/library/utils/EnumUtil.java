package online.mx.android.library.utils;


import java.util.Objects;

public class EnumUtil {

    public static <E extends Enum<E>> void checkByEnum(
            Class<E> enumType, String type
    ) throws Exception {
        if (!enumType.isEnum() || type == null) {
            throw new Exception("enumType or types must have");
        }
        for (E constant : Objects.requireNonNull(enumType.getEnumConstants())) {
            if (constant.name().equals(type)) {
                return;
            }
        }
        throw new Exception("Parameter Type Error");
    }
}
