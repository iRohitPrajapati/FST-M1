-- Add the grade column
ALTER TABLE salesman ADD grade int;
describe salesman;
-- Update the values in the grade column
UPDATE salesman SET grade=100;

-- Display data
SELECT * FROM salesman;