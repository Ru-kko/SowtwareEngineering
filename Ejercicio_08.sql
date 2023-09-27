-- Triggers

DELIMITER //
--              NAME                         -- Table
CREATE TRIGGER _log_oninsert AFTER INSERT ON estado
FOR EACH ROW BEGIN
  -- Get attr
	SET @detail = NEW.detalle;
  SET @color = NEW.Color;
  SET @active = NEW.Activo;

  CALL _add_log(CONCAT(
      'Se inserto un estado con el detalle ',
      @detail,
      ", color ",
      @color,
      " y estado ",
      @active
    )
  );
END;//

CREATE TRIGGER _add_color BEFORE INSERT ON estado
FOR EACH ROW BEGIN
  -- Get attr
  SET @color = NEW.Color;

  IF @color = 0 THEN
    SET NEW.color = '#FF0000';
  ELSE
    SET NEW.color = '#00FF00';
  END IF;
END;//
