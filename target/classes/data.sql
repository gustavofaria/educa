DROP TABLE IF EXISTS ponteiro;
 
CREATE TABLE ponteiro (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  tipo VARCHAR(250) NOT NULL
);
 
INSERT INTO ponteiro (nome, tipo) VALUES
  ('google', 'textual'),
  ('kanacademy', 'visual'),
  ('youtube', 'visual');